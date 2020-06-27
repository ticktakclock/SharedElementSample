package com.github.ticktakclock.sharedelementsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.github.ticktakclock.sharedelementsample.databinding.ActivityMainBinding
import com.github.ticktakclock.sharedelementsample.databinding.ActivityMainBindingImpl

class MainActivity : AppCompatActivity() {

    lateinit var controller: PhotoController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        controller = PhotoController().apply {
            setData(Photo.createDummy())
        }
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            setController(controller)
        }
    }

    override fun onResume() {
        super.onResume()
        controller.setData(Photo.createDummy())
    }
}