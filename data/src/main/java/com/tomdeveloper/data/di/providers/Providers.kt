package com.tomdeveloper.data.di.providers

import android.app.Application
import androidx.room.RoomDatabase
import com.tomdeveloper.data.local.UsersDataBase
import com.tomdeveloper.data.repositories.UsersRepository


fun provideDatabase(application: Application):RoomDatabase {
    return UsersDataBase.getInstance(application)
}

fun provideUsersRepository(usersDataBase: UsersDataBase):UsersRepository {
    return UsersRepository(usersDataBase)
}