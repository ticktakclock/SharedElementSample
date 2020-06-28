package com.github.ticktakclock.sharedelementsample

import android.view.View
import com.airbnb.epoxy.TypedEpoxyController

class PhotoController(private val onPhotoClicked: (Photo) -> Unit) :
    TypedEpoxyController<List<Photo>>() {

    override fun buildModels(data: List<Photo>?) {
        data ?: return

        data.forEach { photo ->
            photo {
                id(modelCountBuiltSoFar)
                title(photo.title)
                imageUrl(photo.imageUrl)
                onClick(View.OnClickListener { onPhotoClicked(photo) })
            }
        }
    }
}