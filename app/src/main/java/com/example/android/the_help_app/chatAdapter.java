package com.example.android.the_help_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL PC on 6/12/2018.
 */

public class chatAdapter extends RecyclerView.Adapter<chatAdapter.ChatViewHolder> {

private List<chats> chatsList;
   public chatAdapter(List<chats> chatsList){

       this.chatsList=chatsList;
   }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.chat_listitem,parent,false);
        return new ChatViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
    chats mchats = chatsList.get(position);
    holder.dateTextView.setText(mchats.getTime());
    holder.messageTextView.setText(mchats.getMessage());
    holder.nameTextView.setText(mchats.getName());
    }

    @Override
    public int getItemCount() {
        return chatsList.size();
    }

    class ChatViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView nameTextView;
        TextView messageTextView;
        TextView dateTextView;


        public ChatViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name);
            messageTextView = itemView.findViewById(R.id.message);
            dateTextView = itemView.findViewById(R.id.time);

        }
    }


}