package com.stefan.fakecallapp.interfaces

import android.app.Activity
import android.content.Context

interface OperationModel {
    fun makeCall(number:String, context: Activity)
}