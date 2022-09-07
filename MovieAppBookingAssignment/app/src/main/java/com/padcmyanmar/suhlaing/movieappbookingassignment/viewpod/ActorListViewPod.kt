package com.padcmyanmar.suhlaing.movieappbookingassignment.viewpod

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcmyanmar.suhlaing.movieappbookingassignment.adapter.ActorAdapter
import kotlinx.android.synthetic.main.view_pod_actor_list.view.*
import kotlinx.android.synthetic.main.view_pod_movie_list.view.*

class ActorListViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {

    lateinit var mActorAdapter : ActorAdapter

    override fun onFinishInflate() {
        setUpActorRecyclerView()
        super.onFinishInflate()
    }

    private fun setUpActorRecyclerView(){
        mActorAdapter = ActorAdapter()
        rvBestActor.adapter = mActorAdapter
        rvBestActor.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
    }
}