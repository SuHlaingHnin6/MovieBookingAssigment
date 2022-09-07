package com.padcmyanmar.suhlaing.movieappbookingassignment.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padcmyanmar.suhlaing.movieappbookingassignment.R

class TicketActivity:AppCompatActivity() {

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent (context,TicketActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket)
    }
}