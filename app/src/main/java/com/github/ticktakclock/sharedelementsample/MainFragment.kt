package com.github.ticktakclock.sharedelementsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.github.ticktakclock.sharedelementsample.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var controller: PhotoController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        controller = PhotoController(
            onPhotoClicked = this::onPhotoClicked
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(context, 2)
            setController(controller)
        }
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        controller.setData(Photo.fetchAll())
    }

    private fun onPhotoClicked(view: View, photo: Photo) {
        val activity = activity ?: return
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, view, "photo")
        ActivityCompat.startActivity(
            activity,
            DetailActivity.createIntent(activity, photo.id),
            options.toBundle()
        )
    }

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }
}