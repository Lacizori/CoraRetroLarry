package me.project.coraretrolarry

import moxy.MvpPresenter
import moxy.InjectViewState


@InjectViewState
class ExamplePresenter : MvpPresenter<ExampleView>() {
    fun onTextClicked() {
        //todo: логика будет тут
        viewState.updateText("Тут будет текст из интернетов")

    }
}