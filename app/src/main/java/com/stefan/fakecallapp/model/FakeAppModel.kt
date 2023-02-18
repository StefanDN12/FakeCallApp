package com.stefan.fakecallapp.model

import android.Manifest
import android.Manifest.permission.CALL_PHONE
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import com.stefan.fakecallapp.interfaces.OperationModel
import com.stefan.fakecallapp.interfaces.OperationPresenter
import com.stefan.fakecallapp.presenter.FakeAppPresenter

class FakeAppModel(presenter: FakeAppPresenter):OperationModel {

    private var presenter = presenter
    private var  intent: Intent = Intent(Intent.ACTION_CALL)


    override fun makeCall(number: String, context: Activity) {
        intent.setData(Uri.parse("tel:"+ number.toInt()))

        if(ContextCompat.checkSelfPermission(context,CALL_PHONE) == PackageManager.PERMISSION_GRANTED){
            context.startActivity(intent)
        }else{
            context.requestPermissions(arrayOf(CALL_PHONE),1)
        }

        presenter.showNumbre(number)
    }
}