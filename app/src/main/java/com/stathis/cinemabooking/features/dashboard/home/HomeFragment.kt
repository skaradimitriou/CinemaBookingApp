package com.stathis.cinemabooking.features.dashboard.home


import androidx.lifecycle.ViewModelProvider
import com.stathis.cinemabooking.R
import com.stathis.cinemabooking.abstraction.AbstractFragment

class HomeFragment : AbstractFragment(R.layout.fragment_home) {

    private lateinit var viewModel : HomeViewModel

    override fun init() {
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
    }

    override fun startOps() {
        //
    }

    override fun stopOps() {
        //
    }
}