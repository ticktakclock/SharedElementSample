package com.github.ticktakclock.sharedelementsample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.databinding.DataBindingUtil
import com.github.ticktakclock.sharedelementsample.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        ViewCompat.setTransitionName(binding.imageView3, "photo")
    }

    override fun onResume() {
        super.onResume()
        val id = intent?.extras?.getInt("id", 0)
        id?.let {
            val photo = Photo.find(it)
            photo?.let { photo ->
                binding.imageUrl = photo.imageUrl
                binding.title = photo.title
            }
        }
    }

    companion object {
        fun createIntent(context: Context, id: Int): Intent =
            Intent(context, DetailActivity::class.java).apply {
                putExtra("id", id)
            }
    }
}