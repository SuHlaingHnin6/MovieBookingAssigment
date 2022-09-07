package com.padcmyanmar.suhlaing.movieappbookingassignment.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.activity.ShowMovieActivity
import com.padcmyanmar.suhlaing.movieappbookingassignment.delegate.LoginButtonDelegate
import com.padcmyanmar.suhlaing.movieappbookingassignment.delegate.LoginRegisterDataPass
import com.padcmyanmar.suhlaing.movieappbookingassignment.viewpod.ViewPodLogin
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_singin.*
import kotlinx.android.synthetic.main.fragment_singin.vploginButton2
import kotlinx.android.synthetic.main.login_view_pod.*
import kotlinx.android.synthetic.main.login_view_pod.view.*

class LoginPageFragment() :Fragment(), LoginButtonDelegate {

    lateinit var mDelegate: LoginButtonDelegate
    lateinit var mLoginDelegate : LoginRegisterDataPass
    private lateinit var loginViewPod : ViewPodLogin

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login,container,false)
    }

    override fun onAttach(context: Context) {
        mLoginDelegate= context as LoginRegisterDataPass
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setUpViewPod()
        super.onViewCreated(view, savedInstanceState)

    }

    private fun setUpViewPod(){

        loginViewPod = vploginButton as ViewPodLogin
        loginViewPod.setUpMovieListViewPod(this)
    }

    override fun onTapComfirm() {
        mLoginDelegate.onLoginData(
            edtLoginEmail.text.toString(),
            edtLoginPassword.text.toString()
        )
    }
}