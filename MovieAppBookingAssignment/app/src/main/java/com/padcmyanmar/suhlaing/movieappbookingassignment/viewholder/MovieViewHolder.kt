package com.padcmyanmar.suhlaing.movieappbookingassignment.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.MovieVo
import com.padcmyanmar.suhlaing.movieappbookingassignment.delegate.MovieViewHolderDelegate
import com.padcmyanmar.suhlaing.movieappbookingassignment.utils.IMAGE_BASE_URL
import kotlinx.android.synthetic.main.view_holder_movie.view.*

class MovieViewHolder(itemView:View,private val mDelegate : MovieViewHolderDelegate): RecyclerView.ViewHolder(itemView) {

    private var mMovie : MovieVo ?=null
init {
    itemView.setOnClickListener {
//        mDelegate.onTapMovie()
        mMovie?.let {
            mDelegate.onTapMovie(it.id)
        }
    }
}

    fun bindData(movie:MovieVo){
        mMovie = movie
        Glide.with(itemView.context)
            .load("$IMAGE_BASE_URL${movie.posterPath}")
            .into(itemView.ivMovieImage)

        itemView.tvmovieName.text = movie.title
        itemView.tvactionMovie.text = movie.voteAverage?.toString()
//        itemView.rbMovieRating.rating = movie.getRatingBaseOnFiveStars()
    }
}