package com.UAS.apps

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Cuti::class), version = 1)
abstract class CutiRoomDatabase : RoomDatabase() {
    abstract fun CutiPbk(): CutiPbk

    abstract val applicationContext: Context
    val db = Room.databaseBuilder(
        applicationContext,
        CutiRoomDatabase::class.java, "DBMHS"
    ).build()

}