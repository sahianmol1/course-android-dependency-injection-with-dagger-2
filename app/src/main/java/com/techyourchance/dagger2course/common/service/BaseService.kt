package com.techyourchance.dagger2course.common.service

import android.app.Service

abstract class BaseService: Service() {

//    private val appComponent get() = (application as MyApplication).appComponent

    val serviceComponent by lazy {
    }

}