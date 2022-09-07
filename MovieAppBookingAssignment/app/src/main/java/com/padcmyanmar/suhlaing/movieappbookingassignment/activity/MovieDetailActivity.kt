package com.padcmyanmar.suhlaing.movieappbookingassignment.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.adapter.ChipMovieDetailAdapter
import kotlinx.android.synthetic.main.activity_detail_movie.*

class MovieDetailActivity : AppCompatActivity() {

    lateinit var mChipMovieDetailAdapter : ChipMovieDetailAdapter

    companion object{
        fun newIntent(context: Context,movieID : Int): Intent {
            return Intent (context,MovieDetailActivity::class.java)
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        setUpChipMovieDetailRecyclerView()

        setUpListener()

        btnGetTicket.setOnClickListener {
            startActivity(TimeMovieActivity.newIntent(this))
        }
    }

    private fun setUpListener(){
        btnback.setOnClickListener {
            super.onBackPressed()
        }
    }


    private  fun setUpChipMovieDetailRecyclerView(){
        mChipMovieDetailAdapter = ChipMovieDetailAdapter()
        rvchip.adapter = mChipMovieDetailAdapter
        rvchip.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
    }
}