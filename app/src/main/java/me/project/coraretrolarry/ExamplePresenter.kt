package me.project.coraretrolarry

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import me.project.coraretrolarry.model.ThumbSize
import me.project.coraretrolarry.network.ImageRetrofitBuilder
import moxy.InjectViewState
import moxy.MvpPresenter
import kotlin.random.Random

@InjectViewState
class ExamplePresenter : MvpPresenter<ExampleView>(),
    CoroutineScope by CoroutineScope(Dispatchers.Main) {

    fun onTextClicked(search: String) {
        launch {
            try {
                val result = ImageRetrofitBuilder.apiClient.getVideosBySearch(
                    query = search,
                    page = Random.nextInt(0, 1000),
                    thumbSize = ThumbSize.LARGE
                )
                viewState.updateImg(result)
            } catch (e: Exception) {
                viewState.showError(e.localizedMessage)
            }
        }
    }
}