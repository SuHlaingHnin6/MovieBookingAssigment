package com.padcmyanmar.suhlaing.movieappbookingassignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.viewholder.MovieDateViewHolder

class MovieDateAdapter:RecyclerView.Adapter<MovieDateViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieDateViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_date,parent,false)
        return MovieDateViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieDateViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return 13
    }
}