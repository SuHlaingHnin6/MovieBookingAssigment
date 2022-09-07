package com.padcmyanmar.suhlaing.movieappbookingassignment.network.response

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.DateVo
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.MovieVo

data class MovieListResponse (
    @SerializedName("dates")
    val dates : DateVo?,

    @SerializedName("page")
    val page : Int?,

    @SerializedName("results")
    val results : List<MovieVo>?,

//    @SerializedName("total_pages")
//    val totalPage : Int?,
//
//    @SerializedName("total_results")
//    val totalResult : Int?,
        )