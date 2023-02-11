package com.stefan.fakecallapp.presenter

import com.stefan.fakecallapp.interfaces.OperationPresenter
import com.stefan.fakecallapp.interfaces.OperationView
import com.stefan.fakecallapp.model.FakeAppModel

class FakeAppPresenter(view: OperationView):OperationPresenter {

    var view = view
    var model = FakeAppModel()

    override fun goCall(number: String) {
        TODO("Not yet implemented")
    }

    override fun showNumbre() {
        TODO("Not yet implemented")
    }


}