package com.padcmyanmar.suhlaing.movieappbookingassignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.viewholder.ChipMovieDetailViewHolder

class ChipMovieDetailAdapter : RecyclerView.Adapter<ChipMovieDetailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChipMovieDetailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_chip_movie_detail,parent,false)
        return ChipMovieDetailViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChipMovieDetailViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 1
    }
}