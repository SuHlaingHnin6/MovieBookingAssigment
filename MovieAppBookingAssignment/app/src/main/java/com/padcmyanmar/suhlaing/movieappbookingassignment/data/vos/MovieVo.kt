package com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos

import com.google.gson.annotations.SerializedName

data class MovieVo (
    @SerializedName("adult")
    val adult : Boolean?,

    @SerializedName("backdrop_path")
    val backDropPath : String?,

    @SerializedName("genre_ids")
    val genreIds : List<Int>?,

    @SerializedName("id")
    val id : Int=0,

    @SerializedName("original_language")
    val originalLanguage : String?,

    @SerializedName("original_title")
    val originalTitle : String?,

    @SerializedName("overview")
    val overView : String?,

    @SerializedName("popularity")
    val popularity : Int?,

    @SerializedName("poster_path")
    val posterPath : String?,

    @SerializedName("release_date")
    val releaseDate : Int?,

    @SerializedName("title")
    val title : String?,

    @SerializedName("video")
    val vedio : Boolean?,

    @SerializedName("vote_average")
    val voteAverage : Double?,

    @SerializedName("vote_count")
    val voteCount : Int?,
        )