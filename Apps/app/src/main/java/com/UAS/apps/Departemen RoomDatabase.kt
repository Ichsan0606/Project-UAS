package com.UAS.apps

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Cuti::class), version = 1)
abstract class DepartemenRoomDatabase : RoomDatabase() {
    abstract fun DepartemenPbk(): DepartemenPbk

    abstract val applicationContext: Context
    val db = Room.databaseBuilder(
        applicationContext,
        DepartemenRoomDatabase::class.java, "DBMHS"
    ).build()

}