package com.techyourchance.dagger2course.screens.common.activities

import androidx.appcompat.app.AppCompatActivity

open class BaseActivity: AppCompatActivity() {


    val activityComponent by lazy {
    }

    private val presentationComponent by lazy {
    }

    protected val injector get() = presentationComponent
}