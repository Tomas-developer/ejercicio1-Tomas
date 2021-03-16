package com.tomdeveloper.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.android.material.circularreveal.CircularRevealHelper
import com.tomdeveloper.data.commons.Constants

@Entity(tableName = Constants.TABLE_NAME)
data class UserDTO (
    @PrimaryKey(autoGenerate = true)
    val id: String,
    val name: String,
    val surname: String
        )