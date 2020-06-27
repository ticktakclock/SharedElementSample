package com.github.ticktakclock.sharedelementsample

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.model.GlideUrl


@BindingAdapter("fromUrl")
fun bindFromUrl(view: ImageView, url: String?) {
    if (url != null && url.isNotEmpty()) {
        Glide.with(view.context).load(GlideUrl(url)).into(view)
    }
}