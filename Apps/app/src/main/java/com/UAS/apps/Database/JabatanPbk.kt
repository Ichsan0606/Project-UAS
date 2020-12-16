package com.UAS.apps.Database

import androidx.room.*

@Dao
interface JabatanPbk {
    @Insert
    suspend fun addJabatan(jabatan: Jabatan)

    @Update
    suspend fun updateJabatan(jabatan: Jabatan)

    @Delete
    suspend fun deleteJabatan(jabatan: Jabatan)

    @Query("SELECT * FROM jabatan")
    suspend fun getAllJabatan(): List<Jabatan>
}

