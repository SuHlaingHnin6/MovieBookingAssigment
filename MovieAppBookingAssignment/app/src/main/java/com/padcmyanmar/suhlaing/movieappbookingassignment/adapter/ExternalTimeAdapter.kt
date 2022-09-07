package com.padcmyanmar.suhlaing.movieappbookingassignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.viewholder.ExternalTimeViewHolder

class ExternalTimeAdapter:RecyclerView.Adapter<ExternalTimeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExternalTimeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_external_time,parent,false)
        return ExternalTimeViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExternalTimeViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 6
    }
}