package com.UAS.apps

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Cuti")
data class Departemen(
            @PrimaryKey val kode_departemen: Text,
            @ColumnInfo val nama_departemen: Text
)
