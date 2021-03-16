package com.tomdeveloper.data.local

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.*
import com.tomdeveloper.data.commons.Constants
import com.tomdeveloper.data.models.UserDTO

@Database(entities = [UserDTO::class], version = 1)
abstract class UsersDataBase: RoomDatabase() {
    abstract fun transactionDao(): UserDao

    companion object{
        @Volatile
        private var INSTANCE: UsersDataBase? = null

        fun getInstance(context: Context): UsersDataBase =
            INSTANCE ?: synchronized(this){
                INSTANCE ?: buildDatabase(context.applicationContext).also {
                    INSTANCE = it
                }
            }

        private fun buildDatabase(appContext: Context): UsersDataBase{
            return Room.databaseBuilder(appContext, UsersDataBase::class.java , Constants.TABLE_NAME)
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}