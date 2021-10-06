package me.project.coraretrolarry

import me.project.coraretrolarry.model.SearchDto
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle


interface ExampleView : MvpView {


    @AddToEndSingle
    fun updateImg(result: SearchDto)
}