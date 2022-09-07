package com.padcmyanmar.suhlaing.movieappbookingassignment.activity

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.snackbar.Snackbar
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.adapter.MovieListAdapter
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.model.MovieModel
import com.padcmyanmar.suhlaing.movieappbookingassignment.data.vos.model.MovieModelIMPL
import com.padcmyanmar.suhlaing.movieappbookingassignment.delegate.MovieViewHolderDelegate
import com.padcmyanmar.suhlaing.movieappbookingassignment.viewpod.MovieListViewPod
import kotlinx.android.synthetic.main.activity_show_movie.*

class ShowMovieActivity:AppCompatActivity() ,MovieViewHolderDelegate{
    var actionBarDrawerToggle: ActionBarDrawerToggle? = null

    lateinit var mNowshowingMovieListViewPod : MovieListViewPod
    lateinit var mCommingSoonMovieListViewPod : MovieListViewPod

    private val mMovieModel: MovieModel = MovieModelIMPL
    lateinit var mBannerAdapter : MovieListAdapter

    companion object{
        fun newIntent(context: Context):Intent{
            return Intent (context,ShowMovieActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_movie)


      setUpToolbar()
        setUpViewPod()
        setUpDrawer()
        requestData()

    }

    private fun requestData(){
        mMovieModel.getNowPlayingMovie(
            onSuccess = {
                mNowshowingMovieListViewPod.setData(it)
                Log.d(ContentValues.TAG,"MovieListSuccess")
            },
            onFailure = {
                Log.d(ContentValues.TAG,"MovieList Failure")
            })
    }

    private fun setUpDrawer(){
//        setSupportActionBar(toolBar)
        actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerlayout,R.string.drawer_open, R.string.drawer_close)
        actionBarDrawerToggle?.let {
            drawerlayout.addDrawerListener(it)
            it.syncState()
        }
        toolBar.elevation = 0.0f
        supportActionBar?.elevation = 0.0f
        supportActionBar?.title = ""
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle?.onOptionsItemSelected(item) == true) {
            true
        } else super.onOptionsItemSelected(item)
    }



    private fun setUpViewPod(){
        mNowshowingMovieListViewPod = vpNowShowingMovieList as MovieListViewPod
        mNowshowingMovieListViewPod.setUpMvieListViewPod(this,"Now Showing")

        mCommingSoonMovieListViewPod = vpCommingSoonMovieList as MovieListViewPod
        mCommingSoonMovieListViewPod.setUpMvieListViewPod(this,"Comming Soon")
    }

    private fun setUpToolbar(){
        //AppBar leading Icon
        setSupportActionBar(toolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_search,menu)
        return true
    }

    override fun onTapMovie(movieId:Int) {
        startActivity(MovieDetailActivity.newIntent(this,movieID = movieId))
    }

}