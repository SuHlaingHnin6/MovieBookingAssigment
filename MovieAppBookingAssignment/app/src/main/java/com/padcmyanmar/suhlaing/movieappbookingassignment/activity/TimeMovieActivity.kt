package com.padcmyanmar.suhlaing.movieappbookingassignment.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.adapter.ExternalTimeAdapter
import com.padcmyanmar.suhlaing.movieappbookingassignment.adapter.MovieDateAdapter
import kotlinx.android.synthetic.main.activity_detail_movie.*
import kotlinx.android.synthetic.main.activity_movie_time.*

class TimeMovieActivity : AppCompatActivity() {
    lateinit var mMovieDateAdapter : MovieDateAdapter

    lateinit var mExternalTimeAdapter : ExternalTimeAdapter

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent (context,TimeMovieActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_time)

        setUpMovieDate()
        setUpMovieTime()
        setUpListener()

        btnNext.setOnClickListener {
            startActivity(SeatinPlanActivity.newIntent(this))
        }
    }

    private fun setUpMovieDate(){
        mMovieDateAdapter = MovieDateAdapter()
        rvdate.adapter = mMovieDateAdapter
        rvdate.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
    }

    private fun setUpListener(){
        TimeBack.setOnClickListener {
            super.onBackPressed()
        }
    }

    private fun setUpMovieTime(){

        mExternalTimeAdapter = ExternalTimeAdapter()
        rvTime.adapter = mExternalTimeAdapter
        rvTime.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}