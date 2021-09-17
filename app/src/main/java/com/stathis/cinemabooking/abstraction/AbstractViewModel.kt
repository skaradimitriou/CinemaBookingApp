package com.stathis.cinemabooking.abstraction

import android.app.Application
import androidx.lifecycle.AndroidViewModel

abstract class AbstractViewModel(app : Application) : AndroidViewModel(app) {

    fun getString(resId : Int) = getApplication<Application>().getString(resId)
}