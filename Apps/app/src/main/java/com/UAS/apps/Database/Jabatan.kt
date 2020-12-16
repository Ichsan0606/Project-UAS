package com.UAS.apps.Database

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "jabatan")
data class Jabatan(
        @ColumnInfo(name = "id") val id: Int,
        @ColumnInfo(name = "jabatan") val jabatan: String,
        parseInt: Int
)