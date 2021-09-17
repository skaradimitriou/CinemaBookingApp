package com.stathis.cinemabooking.features.dashboard.profile


import androidx.lifecycle.ViewModelProvider
import com.stathis.cinemabooking.R
import com.stathis.cinemabooking.abstraction.AbstractFragment

class ProfileFragment : AbstractFragment(R.layout.fragment_profile) {

    private lateinit var viewModel : ProfileViewModel

    override fun init() {
        viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
    }

    override fun startOps() {
        //
    }

    override fun stopOps() {
        //
    }
}