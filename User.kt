package com.example.roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey
// data access object   "DAO"   whever we want to access object we make a DAO class
@Entity
data class User(
    val name:String,
    val number:String,
    val address:String,
    val age:Int,
    @PrimaryKey(autoGenerate = true)
    val id:Long = 0L
)