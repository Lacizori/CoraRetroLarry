package me.project.coraretrolarry

import me.project.coraretrolarry.model.SearchDto
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle
import moxy.viewstate.strategy.alias.Skip

interface ExampleView : MvpView {

    @AddToEndSingle
    fun updateImg(result: SearchDto)

    @Skip
    fun showError(message: String)

    @Skip
    fun showOrHideProgressBar(show: Boolean)
}