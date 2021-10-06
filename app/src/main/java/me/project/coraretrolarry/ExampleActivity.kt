package me.project.coraretrolarry

import android.os.Bundle
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter
import kotlinx.android.synthetic.main.activity_main.*

class ExampleActivity : MvpAppCompatActivity() {

    @InjectPresenter
    lateinit var presenter: ExamplePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setOnClickListener {
            presenter.onTextClicked()

    }

}