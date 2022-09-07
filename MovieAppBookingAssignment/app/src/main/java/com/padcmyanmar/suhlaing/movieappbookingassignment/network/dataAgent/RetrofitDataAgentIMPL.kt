package com.padcmyanmar.suhlaing.movieappbookingassignment.network.dataAgent

import android.content.ContentValues
import android.util.Log
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.MovieVo
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.RegisterLoginLogoutVo
import com.padcmyanmar.suhlaing.movieappbookingassignment.network.RegisterApi
import com.padcmyanmar.suhlaing.movieappbookingassignment.network.response.MovieListResponse
import com.padcmyanmar.suhlaing.movieappbookingassignment.network.response.RegisterUserResponse
import com.padcmyanmar.suhlaing.movieappbookingassignment.utils.BASE_URL
import com.padcmyanmar.suhlaing.movieappbookingassignment.utils.BASE_URL_MOVIE
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitDataAgentIMPL : MovieDataAgent {

    private var mRegisterApi: RegisterApi? = null
    private var mMovieApi : RegisterApi? = null


    init {
        val mOkHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(mOkHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val retrofit2 = Retrofit.Builder()
            .baseUrl(BASE_URL_MOVIE)
            .client(mOkHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        mRegisterApi = retrofit.create(RegisterApi::class.java)
        mMovieApi = retrofit2.create(RegisterApi::class.java)
    }

    override fun PostRegisterWithEmail(
        name: String,
        email: String,
        phone: String,
        password: String,
        onSuccess: (Pair<RegisterLoginLogoutVo?, String?>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        mRegisterApi?.RegisterWithEmail(
            name = name,
            email = email,
            phone = phone,
            password = password
        )?.enqueue(object : Callback<RegisterUserResponse> {
            override fun onResponse(
                call: Call<RegisterUserResponse>,
                response: Response<RegisterUserResponse>
            ) {
                if (response.isSuccessful) {
                    response.body()?.apply {
                        if (code == 200) {
                            onSuccess(Pair(data, token))
                        } else {
                            response.body()?.message ?: "Error"
                        }
                    }
                }
            }

            override fun onFailure(call: Call<RegisterUserResponse>, t: Throwable) {
                onFailure(t.message ?: "")
            }


        })

    }

    override fun PostLoginWithEmail(
        email: String,
        password: String,
        onSuccess: (Pair<RegisterLoginLogoutVo?, String?>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        mRegisterApi?.LoginWithEmail(
            email = email,
            password = password
        )?.enqueue(object : Callback<RegisterUserResponse> {
            override fun onResponse(
                call: Call<RegisterUserResponse>,
                response: Response<RegisterUserResponse>
            ) {
                Log.i(ContentValues.TAG,"This is response" + response.message())

                if (response.isSuccessful) {
                    response.body()?.apply {
                        if (code == 200) {
                            onSuccess(Pair(data, token))
                        } else {
                            response.body()?.message ?: "Error"
                        }
                    }
                }

            }

            override fun onFailure(call: Call<RegisterUserResponse>, t: Throwable) {
                onFailure(t.message ?: "")
            }
        })
    }

    override fun GetNowPlayingMoving(
        onSuccess: (List<MovieVo>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        mMovieApi?.getNowPlayingMovies()
            ?.enqueue(object : Callback<MovieListResponse>{
            override fun onResponse(
                call: Call<MovieListResponse>,
                response: Response<MovieListResponse>
            ) {
                if(response.isSuccessful){
                    val movielist = response.body()?.results?: listOf()
                    Log.i(ContentValues.TAG,"This is Movie Success")
                    onSuccess(movielist)
                }else{
                    onFailure(response.message())
                    Log.i(ContentValues.TAG,"This is Movie Failure")
                }
            }

            override fun onFailure(call: Call<MovieListResponse>, t: Throwable) {
                onFailure(t.message ?: "")
            }
        })
    }


}