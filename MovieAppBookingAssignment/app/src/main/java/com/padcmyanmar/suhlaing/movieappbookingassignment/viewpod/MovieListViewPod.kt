package com.padcmyanmar.suhlaing.movieappbookingassignment.viewpod

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.adapter.MovieListAdapter
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.MovieVo
import com.padcmyanmar.suhlaing.movieappbookingassignment.delegate.MovieViewHolderDelegate
import kotlinx.android.synthetic.main.view_holder_movie.view.*
import kotlinx.android.synthetic.main.view_pod_movie_list.view.*

class MovieListViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {

    lateinit var mMovieAdapter : MovieListAdapter
    lateinit var mDelegate : MovieViewHolderDelegate


    override fun onFinishInflate() {
//        setUpMovieRecyclerView()
        super.onFinishInflate()
    }

    fun setUpMvieListViewPod(delegate: MovieViewHolderDelegate, titleText:String = context.getString(R.string.default_titile_movie_list_view_pod)){
       setDelegate(delegate)
        tvTitleText.text = titleText
//        setDelegate(delegate)
        setUpMovieRecyclerView()
    }

    private fun setDelegate(delegate: MovieViewHolderDelegate){
        this.mDelegate = delegate
    }

    private fun setUpMovieRecyclerView(){
        mMovieAdapter = MovieListAdapter(mDelegate)
        rvMovieList.adapter = mMovieAdapter
        rvMovieList.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
    }

    fun setData(movieList: List<MovieVo>){
        mMovieAdapter.setNewData(movieList)

    }
}