package com.padcmyanmar.suhlaing.movieappbookingassignment.viewholder

import android.text.format.Time
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.suhlaing.movieappbookingassignment.adapter.TimeAdapter
import kotlinx.android.synthetic.main.activity_movie_time.view.*
import kotlinx.android.synthetic.main.view_holder_external_time.view.*

class ExternalTimeViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){



    init {
        val internalAdapter = TimeAdapter()
        itemView.rvinternalTime.adapter = internalAdapter
        itemView.rvinternalTime.layoutManager = GridLayoutManager(itemView.context,3,GridLayoutManager.VERTICAL,false)
    }
}