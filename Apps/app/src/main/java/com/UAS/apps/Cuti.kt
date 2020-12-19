package com.UAS.apps

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Cuti")
data class Cuti(
            @PrimaryKey val nomor-induk: Text,
            @PrimaryKey val bulan: Int,
            @PrimaryKey val tahun: Int,
            @ColumnInfo val jumlah_cuti: Int
)
