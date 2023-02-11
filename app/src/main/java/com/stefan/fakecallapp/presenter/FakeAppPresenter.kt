package com.stefan.fakecallapp.presenter

import com.stefan.fakecallapp.interfaces.OperationPresenter
import com.stefan.fakecallapp.interfaces.OperationView
import com.stefan.fakecallapp.model.FakeAppModel

class FakeAppPresenter(view: OperationView):OperationPresenter {

    var view = view
    var model = FakeAppModel(this)

    override fun goCall(number: String) {
        TODO("Not yet implemented")
    }

    override fun showNumbre(number: String) {
        TODO("Not yet implemented")
    }


}