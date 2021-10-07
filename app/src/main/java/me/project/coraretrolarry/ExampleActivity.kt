package me.project.coraretrolarry

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import me.project.coraretrolarry.model.SearchDto
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

class ExampleActivity : MvpAppCompatActivity(), ExampleView {

    @InjectPresenter
    lateinit var presenter: ExamplePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        knopkabot.setOnClickListener {
            presenter.onTextClicked(search.text.toString())
        }
    }

    override fun updateImg(result: SearchDto) {
        loadImage(image1verhlevo, result.videos[0].defaultThumb.src)
        loadImage(image2verhpravo, result.videos[1].defaultThumb.src)
        loadImage(image3niz, result.videos[2].defaultThumb.src)
    }

    private fun loadImage(imageView: ImageView, url: String) {
        Glide.with(this)
            .load(url)
            .centerCrop()
            .into(imageView)
    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun showOrHideProgressBar(show: Boolean) {
        progress_bar.visibility = if (show)
            View.VISIBLE
        else
            View.GONE
    }
}