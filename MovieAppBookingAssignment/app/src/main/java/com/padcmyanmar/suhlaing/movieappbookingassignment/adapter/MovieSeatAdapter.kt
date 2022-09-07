package com.padcmyanmar.suhlaing.movieappbookingassignment.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.MovieSeatVo
import com.padcmyanmar.suhlaing.movieappbookingassignment.viewholder.MovieSeatViewHolder

class MovieSeatAdapter(private var mMoviseat:List<MovieSeatVo> = listOf()):RecyclerView.Adapter<MovieSeatViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieSeatViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_movie_seat,parent,false)
        return MovieSeatViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieSeatViewHolder, position: Int) {
       if (mMoviseat.isNotEmpty()){
           holder.bindData(mMoviseat[position])
       }
    }

    override fun getItemCount(): Int {
        return mMoviseat.count()
    }

    @SuppressLint("NotifDataSetChanged")
    fun setNewData(movieSeat:List<MovieSeatVo>){
        this.mMoviseat = movieSeat
        notifyDataSetChanged()
    }
}