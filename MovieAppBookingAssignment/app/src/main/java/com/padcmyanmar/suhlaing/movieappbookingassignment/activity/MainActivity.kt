package com.padcmyanmar.suhlaing.movieappbookingassignment.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGested.setOnClickListener {
            val intent = Intent(this, ShowMovieActivity::class.java)
            startActivity(intent)
        }
    }
}