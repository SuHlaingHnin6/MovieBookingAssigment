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
import kotlinx.android.synthetic.main.fragment_singin.*
import kotlinx.android.synthetic.main.login_view_pod.view.*

class SigninPageFragment() :Fragment(),LoginButtonDelegate{


    lateinit var mDelegate: LoginButtonDelegate
    lateinit var mSinginDelegate : LoginRegisterDataPass

    private lateinit var loginViewPod : ViewPodLogin

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_singin,container,false)
    }

    override fun onAttach(context: Context) {
        mSinginDelegate = context as LoginRegisterDataPass
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setUpViewPod()
        super.onViewCreated(view, savedInstanceState)

//       view.btnLoginComfirm.setOnClickListener {
//           requireActivity().startActivity(ShowMovieActivity.newIntent(requireActivity()))
//       }

        }
    private fun setUpViewPod(){

        loginViewPod = vploginButton2 as ViewPodLogin
        loginViewPod.setUpMovieListViewPod(this)
    }

    override fun onTapComfirm() {
        mSinginDelegate.onRegisterData(
            edtEmail.text.toString(),
            edtPassword.text.toString(),
            edtSignName.text.toString(),
            edtPhone.text.toString()
        )
    }

}