package com.example.tasklist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private final ArrayList<Task> taskList;
    public RecyclerAdapter(ArrayList<Task> taskList){
        this.taskList = taskList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView dateText;
        private TextView taskText;


        public MyViewHolder(final View view) {
            super(view);
            dateText = view.findViewById(R.id.dateView);
            taskText = view.findViewById(R.id.taskView);
        }
    }
    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tasks_layout,parent,false);
       return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        String date = taskList.get(position).getDate();
        String task = taskList.get(position).getTask();
        holder.dateText.setText(date);
        holder.taskText.setText(task);

    }

    @Override
    public int getItemCount() {
       return taskList.size();
    }
}
