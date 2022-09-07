package com.padcmyanmar.suhlaing.movieappbookingassignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.viewholder.TimeViewHolder

class TimeAdapter:RecyclerView.Adapter<TimeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_time,parent,false)
        return TimeViewHolder(view)
    }

    override fun onBindViewHolder(holder: TimeViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 9
    }

}