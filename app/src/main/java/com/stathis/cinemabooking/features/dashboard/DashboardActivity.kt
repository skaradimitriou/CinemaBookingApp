package com.stathis.cinemabooking.features.dashboard

import android.os.Bundle
import com.stathis.cinemabooking.R
import com.stathis.cinemabooking.abstraction.AbstractActivity
import com.stathis.cinemabooking.databinding.ActivityDashboardBinding

class DashboardActivity : AbstractActivity(R.layout.activity_dashboard) {

    private lateinit var binding : ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
    }

    override fun init() {
        //
    }

    override fun startOps() {}

    override fun stopOps() {}
}