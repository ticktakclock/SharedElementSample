package com.github.ticktakclock.sharedelementsample

import com.airbnb.epoxy.TypedEpoxyController

class PhotoController : TypedEpoxyController<List<Photo>>() {

    override fun buildModels(data: List<Photo>?) {
        data ?: return

        data.forEach {
            photo {
                id(modelCountBuiltSoFar)
                title(it.title)
                imageUrl(it.imageUrl)
            }
        }
    }
}