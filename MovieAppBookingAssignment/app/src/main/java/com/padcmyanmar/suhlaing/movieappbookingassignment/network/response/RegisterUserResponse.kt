package com.padcmyanmar.suhlaing.movieappbookingassignment.network.response

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.RegisterLoginLogoutVo

data class RegisterUserResponse (
    @SerializedName("code")
    val code : Int?,

    @SerializedName("message")
    val message : String?,

    @SerializedName("data")
    val data : RegisterLoginLogoutVo?,

    @SerializedName("token")
    val token : String?,

    )