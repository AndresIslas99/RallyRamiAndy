package com.example.rallyramiandy.Adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rallyramiandy.R
import com.example.rallyramiandy.data.Tasks

class TasksViewHolder(view:View):RecyclerView.ViewHolder(view) {


    val tasksDate=view.findViewById<TextView>(R.id.tvTaskDate)
    val tasksName=view.findViewById<TextView>(R.id.tvTaskName)
    val tasksPr=view.findViewById<TextView>(R.id.tvTaskPior)

    fun render(tasksModel: Tasks){
        tasksDate.text = tasksModel.fecha
        tasksName.text = tasksModel.TaskName
        tasksPr.text = tasksModel.Prioridad.toString()
    }
}