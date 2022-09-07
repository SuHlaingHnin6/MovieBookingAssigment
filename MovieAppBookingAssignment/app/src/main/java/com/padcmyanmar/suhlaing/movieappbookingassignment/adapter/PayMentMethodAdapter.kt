package com.padcmyanmar.suhlaing.movieappbookingassignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.viewholder.PayMentMethodViewHolder

class PayMentMethodAdapter:RecyclerView.Adapter<PayMentMethodViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PayMentMethodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_payment_method,parent,false)
        return PayMentMethodViewHolder(view)
    }

    override fun onBindViewHolder(holder: PayMentMethodViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return 3
    }
}