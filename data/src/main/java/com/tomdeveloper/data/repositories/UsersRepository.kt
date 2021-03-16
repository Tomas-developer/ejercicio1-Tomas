package com.tomdeveloper.data.repositories

import com.tomdeveloper.data.local.UsersDataBase
import com.tomdeveloper.data.models.UserDTO

class UsersRepository(private val usersDb: UsersDataBase) {

    fun saveUser(user: UserDTO){
        usersDb.transactionDao().save(user)
    }
}