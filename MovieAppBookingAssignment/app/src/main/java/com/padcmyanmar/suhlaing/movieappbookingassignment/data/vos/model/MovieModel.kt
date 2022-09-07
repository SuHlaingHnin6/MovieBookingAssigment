package com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.model

import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.MovieVo
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.RegisterLoginLogoutVo

interface MovieModel {

    fun registerUser(
        name : String,
        email : String,
        phone : String,
        password : String,
        onSuccess: ()->Unit,
        onFailure : (String)->Unit
    )

    fun LoginWithEmail(
        email : String,
        password : String,
        onSuccess: () -> Unit,
        onFailure: (String)-> Unit
    )

    fun getNowPlayingMovie(
        onSuccess : (List<MovieVo>)-> Unit,
        onFailure: (String)-> Unit
    )
}