package com.example.tasklist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class Fragment1 extends Fragment {
    public static ArrayList<Task> tasks;
    private RecyclerView recyclerView;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tasks = new ArrayList<>();
        this.view = inflater.inflate(R.layout.framgent1_layout,container,false);
        setAdapter();
        //setTaskInfo();
        return view;
    }


  public void setAdapter() {
        RecyclerAdapter adapter = new RecyclerAdapter(tasks);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView = this.view.findViewById(R.id.view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    public static void setTaskInfo(Task task) {
        tasks.add(task);
    }

}
