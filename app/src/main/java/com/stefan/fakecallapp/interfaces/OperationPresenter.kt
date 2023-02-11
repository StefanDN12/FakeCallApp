package com.stefan.fakecallapp.interfaces

import android.content.Context

interface OperationPresenter {
    fun goCall(number: String, context: Context)
    fun showNumbre(number: String)
}