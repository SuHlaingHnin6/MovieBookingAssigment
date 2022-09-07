package com.padcmyanmar.suhlaing.movieappbookingassignment.network

import android.provider.ContactsContract
import com.padcmyanmar.suhlaing.movieappbookingassignment.network.response.MovieListResponse
import com.padcmyanmar.suhlaing.movieappbookingassignment.network.response.RegisterUserResponse
import com.padcmyanmar.suhlaing.movieappbookingassignment.utils.*
import retrofit2.Call
import retrofit2.http.*

interface RegisterApi {

    @POST(API_POST_REGISTER)
    @FormUrlEncoded
    fun RegisterWithEmail(
        @Field("name")name:String,
        @Field("email") email: String,
        @Field("phone")phone:String,
        @Field("password") password: String
    ): Call<RegisterUserResponse>


    @POST(API_POST_LOGIN_WITH_EMAIL)
    @FormUrlEncoded
    fun LoginWithEmail(
        @Field("email")email : String,
        @Field("password")password : String,
    ):Call<RegisterUserResponse>

    @GET(API_GET_NOW_PLAYING)
    fun getNowPlayingMovies(
        @Query(PARAM_API_KEY) apiKey: String = MOVIE_API_KEY,
        @Query(PARAM_LANGUAGE)language : String = MOVIE_LANGUAGE,
        @Query(PARAM_PAGE) page: Int = 1,
    ):Call<MovieListResponse>

}