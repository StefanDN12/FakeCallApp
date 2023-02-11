package com.stefan.fakecallapp.interfaces

import android.content.Context

interface OperationModel {
    fun makeCall(number:String, context: Context)
}