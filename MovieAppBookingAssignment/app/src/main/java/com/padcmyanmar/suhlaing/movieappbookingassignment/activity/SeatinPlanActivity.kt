package com.padcmyanmar.suhlaing.movieappbookingassignment.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.adapter.MovieSeatAdapter
import com.padcmyanmar.suhlaing.movieappbookingassignment.dummy.DUMMY_SEATS
import kotlinx.android.synthetic.main.activity_seating_plan.*

class SeatinPlanActivity: AppCompatActivity() {

    private val mAdapter: MovieSeatAdapter = MovieSeatAdapter()

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent (context,SeatinPlanActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seating_plan)

        rvSeatPlan.adapter = mAdapter
        rvSeatPlan.layoutManager = GridLayoutManager(applicationContext,10)

        mAdapter.setNewData(DUMMY_SEATS)

        setUpListener()

        btnBuyTicket.setOnClickListener {
            startActivity(ChoosePaymentActivity.newIntent(this))
        }
    }
    private fun setUpListener(){
        btnbackTime.setOnClickListener {
            super.onBackPressed()
        }
    }
}