package com.example.android.the_help_app;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class knowlegeCafe extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<chats> chatsArrayList = new ArrayList<>();
    private chatAdapter chatAdapter;
    private int numlist = chatsArrayList.size();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View rootView = inflater.inflate(R.layout.knowlege_recycler,container,false);

      recyclerView = (RecyclerView)rootView.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        chatAdapter =new chatAdapter(numlist, chatsArrayList);
        recyclerView.setAdapter(chatAdapter);
        PopulateFakeData();
      return rootView;
    }


    // Fake Data For Testing
    public void PopulateFakeData(){
        chatsArrayList.add(new chats("2:34:pm","hello im new here","John"));
        chatsArrayList.add(new chats("12:40:pm","hello John welcome","Peter"));
        chatsArrayList.add(new chats("2:00:am","The Help App","Obi"));
        chatsArrayList.add(new chats("15:00:pm","I need a Mentor","Emeka"));
        chatsArrayList.add(new chats("19:44:pm","About to sleep","charlyge"));
        chatsArrayList.add(new chats("12:40:amm","hello John welcome","Peter"));
        chatsArrayList.add(new chats("2:34:pm","hello im new here","ShyCoder"));
        chatsArrayList.add(new chats("12:40:pm","hello John welcome","Idiam"));
        chatsArrayList.add(new chats("2:34:pm","hello im new here","Cypher"));
        chatsArrayList.add(new chats("12:40:pm","hello John welcome","Coachee"));
        chatsArrayList.add(new chats("2:34:pm","hello im new here","Amaka"));
        chatsArrayList.add(new chats("12:40:pm","hello John welcome","Ebere"));
        chatAdapter.notifyDataSetChanged();
    }
}
