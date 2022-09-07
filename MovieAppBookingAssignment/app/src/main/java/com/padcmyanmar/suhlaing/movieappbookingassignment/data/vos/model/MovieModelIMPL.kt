package com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.model

import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.MovieVo
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.RegisterLoginLogoutVo
import com.padcmyanmar.suhlaing.movieappbookingassignment.network.dataAgent.MovieDataAgent
import com.padcmyanmar.suhlaing.movieappbookingassignment.network.dataAgent.RetrofitDataAgentIMPL

object MovieModelIMPL : MovieModel {

    val mMovieDataAgent : MovieDataAgent = RetrofitDataAgentIMPL
    var usertoken : String? = null

    override fun registerUser(
        name: String,
        email: String,
        phone: String,
        password: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        mMovieDataAgent.PostRegisterWithEmail(
            name = name,
            email = email,
            phone = phone,
            password = password,
            onSuccess = {
                val userVo = it.first
                val token = it.second
                this.usertoken = token.toString()
                onSuccess()
            },
            onFailure = onFailure
        )
    }

    override fun LoginWithEmail(
        email: String,
        password: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        mMovieDataAgent.PostLoginWithEmail(
            email = email,
            password = password,
            onSuccess = {
                val token = it.first
                val userVo = it.second
                this.usertoken = token.toString()
                onSuccess
            },
            onFailure = onFailure
        )
    }

    override fun getNowPlayingMovie(
        onSuccess: (List<MovieVo>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        mMovieDataAgent.GetNowPlayingMoving(onSuccess = onSuccess, onFailure = onFailure)
    }


}