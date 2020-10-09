package com.example.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface UserDao{
    @Insert
    suspend fun insert(user:User)

    @Insert
    fun insertAll(list:List<User>)

    @Delete
    fun delete(user:User)

    @Query ("SELECT * FROM User")
    suspend fun getAllUser():List<User>

    @Query ("Select * From User WHERE age >= :age ")
    fun getUserWithAge(age:Int) : List<User>
}