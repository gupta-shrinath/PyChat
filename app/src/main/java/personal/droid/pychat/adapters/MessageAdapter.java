package personal.droid.pychat.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import personal.droid.pychat.R;
import personal.droid.pychat.interfaces.OnMessageItemClick;
import personal.droid.pychat.models.AttachmentTypes;
import personal.droid.pychat.models.Message;
import personal.droid.pychat.viewHolders.BaseMessageViewHolder;
import personal.droid.pychat.viewHolders.MessageAttachmentAudioViewHolder;
import personal.droid.pychat.viewHolders.MessageAttachmentContactViewHolder;
import personal.droid.pychat.viewHolders.MessageAttachmentDocumentViewHolder;
import personal.droid.pychat.viewHolders.MessageAttachmentImageViewHolder;
import personal.droid.pychat.viewHolders.MessageAttachmentLocationViewHolder;
import personal.droid.pychat.viewHolders.MessageAttachmentRecordingViewHolder;
import personal.droid.pychat.viewHolders.MessageAttachmentVideoViewHolder;
import personal.droid.pychat.viewHolders.MessageTextViewHolder;
import personal.droid.pychat.viewHolders.MessageTypingViewHolder;

import java.util.ArrayList;

/**
 * Created by a_man on 1/10/2017.
 */

public class MessageAdapter extends RecyclerView.Adapter<BaseMessageViewHolder> {
    private OnMessageItemClick itemClickListener;
    private MessageAttachmentRecordingViewHolder.RecordingViewInteractor recordingViewInteractor;
    private String myId;
    private Context context;
    private ArrayList<Message> messages;
    private View newMessage;

    public static final int MY = 0x00000000;
    public static final int OTHER = 0x0000100;

    public MessageAdapter(Context context, ArrayList<Message> messages, String myId, View newMessage) {
        this.context = context;
        this.messages = messages;
        this.myId = myId;
        this.newMessage = newMessage;

        if (context instanceof OnMessageItemClick) {
            this.itemClickListener = (OnMessageItemClick) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement ChatItemClickListener");
        }

        if (context instanceof MessageAttachmentRecordingViewHolder.RecordingViewInteractor) {
            this.recordingViewInteractor = (MessageAttachmentRecordingViewHolder.RecordingViewInteractor) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement RecordingViewInteractor");
        }
    }

    @NonNull
    @Override
    public BaseMessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        viewType &= 0x00000FF;
        switch (viewType) {
            case AttachmentTypes.RECORDING:
                return new MessageAttachmentRecordingViewHolder(LayoutInflater.from(context).inflate(R.layout.item_message_attachment_recording, parent, false), itemClickListener, recordingViewInteractor);
            case AttachmentTypes.AUDIO:
                return new MessageAttachmentAudioViewHolder(LayoutInflater.from(context).inflate(R.layout.item_message_attachment_audio, parent, false), itemClickListener);
            case AttachmentTypes.CONTACT:
                return new MessageAttachmentContactViewHolder(LayoutInflater.from(context).inflate(R.layout.item_message_attachment_contact, parent, false), itemClickListener);
            case AttachmentTypes.DOCUMENT:
                return new MessageAttachmentDocumentViewHolder(LayoutInflater.from(context).inflate(R.layout.item_message_attachment_document, parent, false), itemClickListener);
            case AttachmentTypes.IMAGE:
                return new MessageAttachmentImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_message_attachment_image, parent, false), itemClickListener);
            case AttachmentTypes.LOCATION:
                return new MessageAttachmentLocationViewHolder(LayoutInflater.from(context).inflate(R.layout.item_message_attachment_location, parent, false), itemClickListener);
            case AttachmentTypes.VIDEO:
                return new MessageAttachmentVideoViewHolder(LayoutInflater.from(context).inflate(R.layout.item_message_attachment_video, parent, false), itemClickListener);
            case AttachmentTypes.NONE_TYPING:
                return new MessageTypingViewHolder(LayoutInflater.from(context).inflate(R.layout.item_message_typing, parent, false));
            case AttachmentTypes.NONE_TEXT:
            default:
                return new MessageTextViewHolder(LayoutInflater.from(context).inflate(R.layout.item_message_text, parent, false), newMessage, itemClickListener);
        }
    }

    @Override
    public void onBindViewHolder(BaseMessageViewHolder holder, int position) {
        holder.setData(messages.get(position), position);
    }

    @Override
    public int getItemViewType(int position) {
        if (getItemCount() == 0) {
            return super.getItemViewType(position);
        } else {
            Message message = messages.get(position);
            int userType;
            if (message.getSenderId().equals(myId))
                userType = MY;
            else
                userType = OTHER;
            return message.getAttachmentType() | userType;
        }
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }
}
