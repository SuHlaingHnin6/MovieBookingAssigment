package com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos

import com.google.gson.annotations.SerializedName

data class RegisterLoginLogoutVo (

@SerializedName("id")
val id : Int?,

@SerializedName("name")
val name : String?,

@SerializedName("email")
val email : String?,

@SerializedName("phone")
val phone : String?,

@SerializedName("total_expense")
val total_expense : Int?,

@SerializedName("profile_image")
val profile_image : String?,

@SerializedName("cards")
val cards : List<CardVo>?

        )