package com.UAS.apps

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.w3c.dom.Text
import java.text.DecimalFormat


@Entity(tableName = "jabatan")
data class Jabatan (
        @PrimaryKey val kode_jabatan: Text,
        @ColumnInfo(name = "nama_jabatan") val nama_jabatan: Text?,
        @ColumnInfo(name = "tunjangan_Jabatan") val tunjangan_Jabatan : DecimalFormat?
)