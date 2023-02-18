package com.stefan.fakecallapp.interfaces

import android.app.Activity
import android.content.Context

interface OperationPresenter {
    fun goCall(number: String, context: Activity)
    fun showNumbre(number: String)
}