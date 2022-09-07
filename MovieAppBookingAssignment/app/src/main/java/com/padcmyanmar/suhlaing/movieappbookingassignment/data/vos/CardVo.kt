package com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos

import com.google.gson.annotations.SerializedName

data class CardVo (
    @SerializedName("id")
    val id : Int?,

    @SerializedName("card_holder")
    val card_holder : String?,

    @SerializedName("card_number")
    val card_number : Int?,

    @SerializedName("expiration_date")
    val expiration_date : Int?,

    @SerializedName("card_type")
    val card_type : String?,
        )