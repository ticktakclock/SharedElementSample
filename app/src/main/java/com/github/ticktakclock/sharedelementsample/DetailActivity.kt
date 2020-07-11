package com.github.ticktakclock.sharedelementsample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.ticktakclock.sharedelementsample.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityDetailBinding>(this, R.layout.activity_detail)
        val id = intent?.extras?.getInt("id", 0) ?: 0
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, DetailFragment.newInstance(id))
            .commit()
    }

    companion object {
        fun createIntent(context: Context, id: Int): Intent =
            Intent(context, DetailActivity::class.java).apply {
                putExtra("id", id)
            }
    }
}