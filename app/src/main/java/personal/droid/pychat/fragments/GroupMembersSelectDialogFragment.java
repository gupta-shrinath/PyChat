package personal.droid.pychat.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import personal.droid.pychat.R;
import personal.droid.pychat.adapters.GroupNewParticipantsAdapter;
import personal.droid.pychat.interfaces.UserGroupSelectionDismissListener;
import personal.droid.pychat.models.User;

import java.util.ArrayList;

/**
 * Created by a_man on 31-12-2017.
 */

public class GroupMembersSelectDialogFragment extends BaseFullDialogFragment implements GroupNewParticipantsAdapter.ParticipantClickListener {
    private ArrayList<User> selectedUsers, myUsers;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_group_select_members, container);
        RecyclerView participants = view.findViewById(R.id.participants);
        RecyclerView myUsersRecycler = view.findViewById(R.id.myUsers);

        participants.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        myUsersRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        GroupNewParticipantsAdapter selectedParticipantsAdapter = new GroupNewParticipantsAdapter(this, selectedUsers);
        participants.setAdapter(selectedParticipantsAdapter);
        myUsersRecycler.setAdapter(new GroupNewParticipantsAdapter(this, myUsers, selectedParticipantsAdapter));

        view.findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        view.findViewById(R.id.done).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        return view;
    }

    public static GroupMembersSelectDialogFragment newInstance(UserGroupSelectionDismissListener dismissListener, ArrayList<User> selectedUsers, ArrayList<User> myUsers) {
        GroupMembersSelectDialogFragment fragment = new GroupMembersSelectDialogFragment();
        fragment.selectedUsers = selectedUsers;
        fragment.myUsers = myUsers;
        fragment.dismissListener = dismissListener;
        return fragment;
    }

    @Override
    public void onParticipantClick(int pos, User participant) {

    }
}
