package com.github.ticktakclock.sharedelementsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import com.github.ticktakclock.sharedelementsample.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDetailBinding.inflate(inflater, container, false)
        ViewCompat.setTransitionName(binding.imageView3, "photo")
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        val id = arguments?.getInt("id", 0)
        id?.let {
            val photo = Photo.find(it)
            photo?.let { photo ->
                binding.imageUrl = photo.imageUrl
                binding.title = photo.title
            }
        }
    }

    companion object {
        fun newInstance(id: Int): DetailFragment {
            return DetailFragment().apply {
                arguments = bundleOf("id" to id)
            }
        }
    }
}