package me.project.coraretrolarry

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import me.project.coraretrolarry.network.ImageRetrofitBuilder.apiClient
import moxy.InjectViewState
import moxy.MvpPresenter
import kotlin.random.Random


@InjectViewState
class ExamplePresenter : MvpPresenter<ExampleView>(),
    CoroutineScope by CoroutineScope(Dispatchers.Main) {

    fun onTextClicked(search: String) {
        launch {
            val result = apiClient.getVideosBySearch(query = search, page = Random.nextInt(0, 100))
            viewState.updateImg(result)
        }
    }
}