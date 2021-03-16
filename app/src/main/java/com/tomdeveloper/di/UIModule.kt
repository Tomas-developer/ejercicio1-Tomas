package com.tomdeveloper.di

import com.tomdeveloper.ejercicio1.home_activity.profile.vm.ProfileViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule = module {
    viewModel { ProfileViewModel() }
}