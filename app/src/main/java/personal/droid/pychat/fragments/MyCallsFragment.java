package personal.droid.pychat.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import personal.droid.pychat.R;
import personal.droid.pychat.adapters.LogCallAdapter;
import personal.droid.pychat.interfaces.HomeIneractor;
import personal.droid.pychat.models.LogCall;
import personal.droid.pychat.models.User;
import personal.droid.pychat.utils.Helper;
import personal.droid.pychat.views.MyRecyclerView;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmQuery;
import io.realm.RealmResults;
import io.realm.Sort;

public class MyCallsFragment extends Fragment {
    private MyRecyclerView recyclerView;
    private LogCallAdapter chatAdapter;

    private Realm rChatDb;
    private User userMe;
    private RealmResults<LogCall> resultList;
    private ArrayList<LogCall> logCallDataList = new ArrayList<>();

    private RealmChangeListener<RealmResults<LogCall>> chatListChangeListener = new RealmChangeListener<RealmResults<LogCall>>() {
        @Override
        public void onChange(@NonNull RealmResults<LogCall> element) {
            if (logCallDataList != null && chatAdapter != null) {
                logCallDataList.clear();
                logCallDataList.addAll(rChatDb.copyFromRealm(element));
                chatAdapter.notifyDataSetChanged();
            }
        }
    };
    private HomeIneractor homeInteractor;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            homeInteractor = (HomeIneractor) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement HomeIneractor");
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        homeInteractor = null;
        if (resultList != null)
            resultList.removeChangeListener(chatListChangeListener);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Helper helper = new Helper(getContext());
        userMe = helper.getLoggedInUser();
        Realm.init(getContext());
        rChatDb = Helper.getRealmInstance();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_recycler, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);

        recyclerView.setEmptyView(view.findViewById(R.id.emptyView));
        recyclerView.setEmptyImageView(((ImageView) view.findViewById(R.id.emptyImage)));
        recyclerView.setEmptyTextView(((TextView) view.findViewById(R.id.emptyText)));
        recyclerView.setEmptyText(getString(R.string.empty_log_call_list));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RealmQuery<LogCall> query = rChatDb.where(LogCall.class).equalTo("myId", userMe.getId());//Query from chats whose owner is logged in user
        resultList = query.sort("timeUpdated", Sort.DESCENDING).findAll();//ignore forward list of messages and get rest sorted according to time

        logCallDataList.clear();
        logCallDataList.addAll(rChatDb.copyFromRealm(resultList));
        chatAdapter = new LogCallAdapter(getActivity(), logCallDataList);
        recyclerView.setAdapter(chatAdapter);

        resultList.addChangeListener(chatListChangeListener);
    }

    public void setUserNamesAsInPhone() {
        if (homeInteractor != null && logCallDataList != null) {
            for (LogCall logCall : logCallDataList) {
                String endTrim = Helper.getEndTrim(logCall.getUserId());
                if (homeInteractor.getLocalContacts().containsKey(endTrim)) {
                    logCall.setUserName(homeInteractor.getLocalContacts().get(endTrim).getName());
                }
            }
            if (chatAdapter != null)
                chatAdapter.notifyDataSetChanged();
        }
    }
}
