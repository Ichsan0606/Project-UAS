package com.UAS.apps

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

interface JabatanPbk {
    @Query("SELECT * FROM jabatan")
    fun getAll(): List<Jabatan>

    @Query("SELECT * FROM jabatan WHERE kode_jabatan IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Jabatan>

    @Query("SELECT * FROM jabatan WHERE nama LIKE :nama AND " +
            "divisi LIKE :divisi LIMIT 1")
    fun findByName(nama: String, divisi: String): Jabatan

    @Insert
    fun insertAll(vararg mahasiswa: Jabatan)

    @Delete
    fun delete(jabatan: Jabatan)
}
