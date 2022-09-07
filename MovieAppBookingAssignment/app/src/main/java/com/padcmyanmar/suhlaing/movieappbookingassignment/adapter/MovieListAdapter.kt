package com.padcmyanmar.suhlaing.movieappbookingassignment.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.MovieVo
import com.padcmyanmar.suhlaing.movieappbookingassignment.delegate.MovieViewHolderDelegate
import com.padcmyanmar.suhlaing.movieappbookingassignment.viewholder.MovieViewHolder

class MovieListAdapter(private val mDelegate : MovieViewHolderDelegate):RecyclerView.Adapter<MovieViewHolder> (){

    private var mMovieList: List<MovieVo> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_movie,parent,false)
        return MovieViewHolder(view,mDelegate)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        if (mMovieList.isNotEmpty()){
            holder.bindData(mMovieList[position])
        }
    }

    override fun getItemCount(): Int {
        return mMovieList.count()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setNewData (movieList: List<MovieVo>){
        mMovieList = movieList
        notifyDataSetChanged()
    }
}