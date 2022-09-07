package com.padcmyanmar.suhlaing.movieappbookingassignment.activity

import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.adapter.DifferentScreenViewPagerAdapter
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.model.MovieModel
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.model.MovieModelIMPL
import com.padcmyanmar.suhlaing.movieappbookingassignment.delegate.LoginButtonDelegate
import com.padcmyanmar.suhlaing.movieappbookingassignment.delegate.LoginRegisterDataPass
import kotlinx.android.synthetic.main.activity_login_page.*

class LoginPageActivity:AppCompatActivity() ,LoginRegisterDataPass{

    private val mMovieModel: MovieModel = MovieModelIMPL

//    lateinit var mDifferentScreenViewPagerAdapter : DifferentScreenViewPagerAdapter

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent (context,LoginPageActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val differentScreenViewPagerAdapter = DifferentScreenViewPagerAdapter(this)
        viewPagerDifferentScreen.adapter = differentScreenViewPagerAdapter


        TabLayoutMediator(tabScreen, viewPagerDifferentScreen){tab,position->
            when(position){
                0->{
                    tab.text = "Login"
                }
                else->{
                    tab.text = "Signin"
                }
            }

        }.attach()


    }



    override fun onRegisterData(email: String, password: String, name: String, phone: String) {

        mMovieModel.registerUser(
            name = name,
            email = email,
            password = password,
            phone = phone,
            onSuccess = {
                startActivity(ShowMovieActivity.newIntent(this))
            },
            onFailure = {
                Toast.makeText(this, "this is register email" + email, Toast.LENGTH_LONG).show()
            }
        )
    }

    override fun onLoginData(email: String, password: String) {
        Log.d(TAG,"eamil"+email+password)


        mMovieModel.LoginWithEmail(
            email = email,
            password = password,
            onSuccess = {
                startActivity(ShowMovieActivity.newIntent(this))
            },
            onFailure = {
                Toast.makeText(this, "this is login email" + email, Toast.LENGTH_LONG).show()
            }
        )
    }

}