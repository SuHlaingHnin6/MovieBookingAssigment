package com.padcmyanmar.suhlaing.movieappbookingassignment.network.dataAgent

import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.MovieVo
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.RegisterLoginLogoutVo

interface MovieDataAgent {

    fun PostRegisterWithEmail(
        name : String,
        email : String,
        phone : String,
        password : String,
        onSuccess: (Pair<RegisterLoginLogoutVo? , String?>) -> Unit,
        onFailure: (String)-> Unit
    )

    fun PostLoginWithEmail(
        email : String,
        password : String,
        onSuccess: (Pair<RegisterLoginLogoutVo? , String?>) -> Unit,
        onFailure: (String)-> Unit
    )

    fun GetNowPlayingMoving(
        onSuccess: (List<MovieVo>) -> Unit,
        onFailure: (String)-> Unit
    )
}