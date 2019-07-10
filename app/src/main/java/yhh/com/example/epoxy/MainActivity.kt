package yhh.com.example.epoxy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import yhh.com.example.epoxy.epoxy.MyEpoxyController
import yhh.com.example.epoxy.model.State

class MainActivity : AppCompatActivity() {

    private lateinit var model: MainActivityModel

    private val controller = MyEpoxyController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = controller.adapter

        model = MainActivityModel(this)
        model.create()
    }

    override fun onDestroy() {
        super.onDestroy()
        model.destroy()
    }

    fun render(state: State) {
        when (state) {
            is State.StartLoading -> {
                progressBar.visibility = View.VISIBLE
            }
            is State.FinishLoading -> {
                progressBar.visibility = View.INVISIBLE
            }
            is State.Update -> {
                controller.setData(state.data)
                Log.i("MainActivity", "data size: ${state.data.size}")
            }
        }
    }
}
