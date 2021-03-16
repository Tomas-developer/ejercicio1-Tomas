package com.tomdeveloper.data.di

import com.tomdeveloper.data.di.providers.provideDatabase
import com.tomdeveloper.data.di.providers.provideUsersRepository
import org.koin.dsl.module

var dataModule = module {
    single { provideDatabase(get()) }
    single { provideUsersRepository(get()) }
}