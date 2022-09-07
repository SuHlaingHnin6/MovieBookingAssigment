package com.padcmyanmar.suhlaing.movieappbookingassignment.delegate

interface LoginRegisterDataPass {
    fun onRegisterData(email:String, password:String, name:String, phone:String)
    fun onLoginData(email:String, password:String)
}