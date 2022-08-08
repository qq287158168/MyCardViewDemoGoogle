package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentFeederBinding
import com.example.myapplication.databinding.HomeFeedChildAudioFragmentBinding
import com.example.myapplication.databinding.HomeFeedItemBaseAudioLayoutBinding

class ItemFragment : Fragment() {


    private lateinit var binding: HomeFeedItemBaseAudioLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.home_feed_item_base_audio_layout,
            container,
            false
        );
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        MyIndex.add()
        val xxx = when (MyIndex.index % 6) {
            1 -> R.drawable.aa1
            2 -> R.drawable.aa2
            3 -> R.drawable.aa3
            4 -> R.drawable.aa4
            5 -> R.drawable.aa5
            else -> R.drawable.aa0
        }

        binding.homeFeedItemBg.setImageResource(xxx)

    }

}