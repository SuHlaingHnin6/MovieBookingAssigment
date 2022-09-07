package com.padcmyanmar.suhlaing.movieappbookingassignment.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcmyanmar.suhlaing.movieappbookingassignment.R
import com.padcmyanmar.suhlaing.movieappbookingassignment.adapter.ComboSetAdapter
import com.padcmyanmar.suhlaing.movieappbookingassignment.adapter.PayMentMethodAdapter
import kotlinx.android.synthetic.main.activity_choose_payment.*

class ChoosePaymentActivity:AppCompatActivity() {

    lateinit var mComboSetAdapter:ComboSetAdapter
    lateinit var mPaymentMethodAdapter:PayMentMethodAdapter

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent (context,ChoosePaymentActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_choose_payment)
        setUpListener()
        setUpComboSetRecycler()
        setUpPayMentMethodRecycler()

        btnPay.setOnClickListener {
            startActivity(CardInfoActivity.newIntent(this))
        }
    }

    private fun setUpListener(){
        btnbackSeat.setOnClickListener {
            super.onBackPressed()
        }
    }

    private fun setUpComboSetRecycler(){
        mComboSetAdapter = ComboSetAdapter()
        rvcomvoSet.adapter = mComboSetAdapter
        rvcomvoSet.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }

    private fun setUpPayMentMethodRecycler(){
        mPaymentMethodAdapter = PayMentMethodAdapter()
        rvpayment.adapter = mPaymentMethodAdapter
        rvpayment.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}