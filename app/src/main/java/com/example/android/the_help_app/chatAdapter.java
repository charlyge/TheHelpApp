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

/**
 * Created by DELL PC on 6/12/2018.
 */

public class chatAdapter extends RecyclerView.Adapter<chatAdapter.chatViewHolder> {

private int numofViews;
private ArrayList<chats> chatsArrayList;
public chatAdapter(int numofViews,ArrayList<chats> chatsArrayList){
    this.numofViews =numofViews;
     this.chatsArrayList = chatsArrayList;
}

    @NonNull
    @Override
    public chatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.knowlege_recycler,parent,false);

        return new chatViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull chatViewHolder holder, int position) {
    chats chats = chatsArrayList.get(position);
    holder.nameTextView.setText(chats.getName());
    holder.dateTextView.setText(chats.getTime());
    holder.messageTextView.setText(chats.getMessage());
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return numofViews;
    }

    class chatViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView nameTextView;
    TextView messageTextView;
    TextView dateTextView;

        public chatViewHolder(View itemView) {
            super(itemView);
            imageView =(ImageView)itemView.findViewById(R.id.profile_pic);
            nameTextView = (TextView)itemView.findViewById(R.id.name);
            messageTextView = (TextView)itemView.findViewById(R.id.message);
            dateTextView = (TextView)itemView.findViewById(R.id.time);
        }
    }
}
