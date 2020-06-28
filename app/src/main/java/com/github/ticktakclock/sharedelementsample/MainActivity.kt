package com.github.ticktakclock.sharedelementsample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.github.ticktakclock.sharedelementsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var controller: PhotoController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        controller = PhotoController(
            onPhotoClicked = this::onPhotoClicked
        )
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            setController(controller)
        }
    }

    override fun onResume() {
        super.onResume()
        controller.setData(Photo.fetchAll())
    }

    private fun onPhotoClicked(view: View, photo: Photo) {
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, view, "photo")
        ActivityCompat.startActivity(
            this,
            DetailActivity.createIntent(this, photo.id),
            options.toBundle()
        )
    }
}