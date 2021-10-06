package me.project.coraretrolarry

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import me.project.coraretrolarry.QuotesRetrofitBuilder.apiService
import moxy.InjectViewState
import moxy.MvpPresenter


@InjectViewState
class ExamplePresenter : MvpPresenter<ExampleView>(),
    CoroutineScope by CoroutineScope(Dispatchers.Main) {
    fun onTextClicked() {

        launch {
            val result = apiService.getQuote()
            viewState.updateText(result.quote)
        }
        viewState.updateText("Тут будет текст из интернетов")

    }
}