package com.stefan.fakecallapp.model

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.stefan.fakecallapp.interfaces.OperationModel
import com.stefan.fakecallapp.interfaces.OperationPresenter
import com.stefan.fakecallapp.presenter.FakeAppPresenter

class FakeAppModel(presenter: FakeAppPresenter):OperationModel {

    private var presenter = presenter
    private var  intent: Intent = Intent(Intent.ACTION_CALL)


    override fun makeCall(number: String, context: Context) {
        intent.setData(Uri.parse("tel:"+ number.toInt()))
        context.startActivity(intent)
        presenter.showNumbre(number)
    }
}