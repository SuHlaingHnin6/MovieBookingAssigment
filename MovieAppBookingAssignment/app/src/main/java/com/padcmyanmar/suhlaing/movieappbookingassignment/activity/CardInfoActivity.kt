package com.padcmyanmar.suhlaing.movieappbookingassignment.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jackandphantom.carouselrecyclerview.CarouselRecyclerview
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.adapter.CarouselAdapter

import kotlinx.android.synthetic.main.activity_card_info.*

class CardInfoActivity: AppCompatActivity() {


    companion object{
        fun newIntent(context: Context): Intent {
            return Intent (context,CardInfoActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_info)

        setUpListener()

        btnComfirm.setOnClickListener {
            startActivity(TicketActivity.newIntent(this))
        }

        val carouselRecyclerview = findViewById<CarouselRecyclerview>(R.id.CarouselRecycler)

        val adapter = CarouselAdapter()
        carouselRecyclerview.adapter = adapter
        carouselRecyclerview.set3DItem(true)
        carouselRecyclerview.setAlpha(true)

        val carouselLayoutManager = carouselRecyclerview.getCarouselLayoutManager()
        val currentCenterposition = carouselRecyclerview.getSelectedPosition()
    }

    private fun setUpListener(){
        btnbackPayMent.setOnClickListener {
            super.onBackPressed()
        }
    }


}