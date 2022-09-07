package com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos

import com.google.gson.annotations.SerializedName

data class DateVo (
    @SerializedName("maximum")
    val maximum : Int?,

    @SerializedName("minimum")
    val minimum : Int?,
        )