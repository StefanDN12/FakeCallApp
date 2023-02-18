package com.stefan.fakecallapp.vista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stefan.fakecallapp.R
import com.stefan.fakecallapp.databinding.ActivityMainBinding
import com.stefan.fakecallapp.interfaces.OperationPresenter
import com.stefan.fakecallapp.interfaces.OperationView
import com.stefan.fakecallapp.presenter.FakeAppPresenter

class FakeAppMainActivity : AppCompatActivity(), OperationView {
    private lateinit var fakeappBinding: ActivityMainBinding
    private lateinit var goCallPrst : OperationPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fakeappBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = fakeappBinding.root
        setContentView(view)
        init()
    }

    fun init(){
        goCallPrst = FakeAppPresenter(this)

        fakeappBinding.btnCall.setOnClickListener {
            makeCall()
        }
    }

    override fun showCalling() {
        fakeappBinding.txtCalling.text = getString(R.string.txtCalling)
    }

    fun makeCall(){
        goCallPrst.goCall(fakeappBinding.editMobilePhonEnter.text.toString(),this)
    }
}