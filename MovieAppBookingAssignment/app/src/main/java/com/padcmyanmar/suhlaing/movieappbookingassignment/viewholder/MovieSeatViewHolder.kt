package com.padcmyanmar.suhlaing.movieappbookingassignment.viewholder

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.MovieSeatVo
import kotlinx.android.synthetic.main.view_holder_movie_seat.view.*

class MovieSeatViewHolder(itemView:View):RecyclerView.ViewHolder (itemView){
    fun bindData(data : MovieSeatVo){
        when{
            data.isMovieSeatAvailable() == true ->{
                itemView.tvMovieSeatTitle.visibility = View.GONE
                itemView.background = ContextCompat.getDrawable(
                    itemView.context,
                    R.drawable.background_seat_available
                )
            }
            data.isMovieTaken() == true ->{
                itemView.tvMovieSeatTitle.visibility = View.GONE
                itemView.background = ContextCompat.getDrawable(
                    itemView.context,
                    R.drawable.background_movie_seat_taken
                )
            }

            data.isMovieSeatRowTitle() ->{
                itemView.tvMovieSeatTitle.visibility = View.VISIBLE
                itemView.tvMovieSeatTitle.text = data.title
                itemView.setBackgroundColor(
                    ContextCompat.getColor(
                        itemView.context,
                        R.color.white
                    )
                )
            }
            else ->{
                itemView.tvMovieSeatTitle.visibility = View.GONE
                itemView.setBackgroundColor(
                    ContextCompat.getColor(
                        itemView.context,
                        R.color.white
                    )
                )
            }
        }
    }
}