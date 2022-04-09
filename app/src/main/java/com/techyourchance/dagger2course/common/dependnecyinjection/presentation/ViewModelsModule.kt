package com.techyourchance.dagger2course.common.dependnecyinjection.presentation

import androidx.lifecycle.ViewModel
import com.techyourchance.dagger2course.screens.viewmodel.MyViewModel
import com.techyourchance.dagger2course.screens.viewmodel.MyViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(MyViewModel::class)
    abstract fun viewModel1(myViewModel: MyViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MyViewModel2::class)
    abstract fun viewModel2(myViewModel2: MyViewModel2): ViewModel
}