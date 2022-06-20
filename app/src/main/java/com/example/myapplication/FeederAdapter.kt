package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FeederAdapter(f: Fragment, lifecycle: Lifecycle) :
    FragmentStateAdapter(f.childFragmentManager, lifecycle) {


    override fun getItemCount() = 10
    override fun createFragment(position: Int): Fragment {
        return ItemFragment()
    }


}
