package com.padcmyanmar.suhlaing.movieappbookingassignment.viewpod

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import com.padcmyanmar.suhlaing.movieappbookingassignment.delegate.LoginButtonDelegate
import kotlinx.android.synthetic.main.activity_card_info.view.*
import kotlinx.android.synthetic.main.login_view_pod.view.*

class ViewPodLogin @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {
    lateinit var mDelegate: LoginButtonDelegate

    override fun onFinishInflate() {
        super.onFinishInflate()

    }

    fun setUpMovieListViewPod(delegate: LoginButtonDelegate) {
//        this.mDelegate = delegate
        btnLoginComfirm.setOnClickListener {
            delegate.onTapComfirm()
        }
    }


 }