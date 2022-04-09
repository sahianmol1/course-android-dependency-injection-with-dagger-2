package com.techyourchance.dagger2course.screens.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

class MyViewModelFactory @Inject constructor(
    private val viewModelProvider: Provider<MyViewModel>,
    private val viewModel2Provider: Provider<MyViewModel2>
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when (modelClass) {
            MyViewModel::class.java -> viewModelProvider.get() as T
            MyViewModel::class.java -> viewModel2Provider.get() as T
            else -> {
                throw RuntimeException("Unsupported ViewModel $modelClass")
            }
        }
    }
}