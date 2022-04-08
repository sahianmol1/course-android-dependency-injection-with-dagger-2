package com.techyourchance.dagger2course.screens.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.techyourchance.dagger2course.questions.FetchQuestionsUseCase
import javax.inject.Inject
import javax.inject.Provider

class MyViewModelFactory @Inject constructor(private val fetchQuestionsUseCaseProvider: Provider<FetchQuestionsUseCase>): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MyViewModel(fetchQuestionsUseCaseProvider.get()) as T
    }
}