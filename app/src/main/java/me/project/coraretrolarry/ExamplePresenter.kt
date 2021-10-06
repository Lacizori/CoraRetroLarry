package me.project.coraretrolarry

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import moxy.InjectViewState
import moxy.MvpPresenter


@InjectViewState
class ExamplePresenter : MvpPresenter<ExampleView>(),
    CoroutineScope by CoroutineScope(Dispatchers.Main) {
    fun onTextClicked() {

        launch {

        }
        viewState.updateText("Тут будет текст из интернетов")

    }
}