package me.project.coraretrolarry

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle


interface ExampleView : MvpView {


    @AddToEndSingle
    fun updateText(text: String)
}