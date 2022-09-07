package com.padcmyanmar.suhlaing.movieappbookingassignment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.padcmyanmar.suhlaing.movieappbookingassignment.delegate.LoginButtonDelegate
import com.padcmyanmar.suhlaing.movieappbookingassignment.delegate.LoginRegisterDataPass
import com.padcmyanmar.suhlaing.movieappbookingassignment.fragment.LoginPageFragment
import com.padcmyanmar.suhlaing.movieappbookingassignment.fragment.SigninPageFragment

class DifferentScreenViewPagerAdapter(fragmentActivity:FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> LoginPageFragment()
            else -> SigninPageFragment()
        }
    }
    }
