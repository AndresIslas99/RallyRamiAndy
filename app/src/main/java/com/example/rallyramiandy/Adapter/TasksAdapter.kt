package com.example.rallyramiandy.Adaptr

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rallyramiandy.Adapter.TasksViewHolder
import com.example.rallyramiandy.R
import com.example.rallyramiandy.data.Tasks

class TasksAdapter(val DataTask:List<Tasks>): RecyclerView.Adapter<TasksViewHolder>() {
private lateinit var bin
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return TasksViewHolder(layoutInflater.inflate(R.layout.item_tasks, parent, false))
    }

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        val item = DataTask[position]
        holder.render(item)

    }

    override fun getItemCount(): Int=10

}