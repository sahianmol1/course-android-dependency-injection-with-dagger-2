package com.techyourchance.dagger2course.screens.common.dialogs

import androidx.fragment.app.DialogFragment

open class BaseDialog: DialogFragment() {

    private val presentationComponent by lazy {
    }

    protected val injector get() = presentationComponent
}