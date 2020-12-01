package com.UAS.apps

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

interface KaryawanPbk {
    @Query("SELECT * FROM karyawan")
    fun getAll(): List<Karyawan>

    @Query("SELECT * FROM karyawan WHERE nip IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Karyawan>

    @Query("SELECT * FROM mahasiswa WHERE nama LIKE :nama AND " +
            "prodi LIKE :prodi LIMIT 1")
    fun findByName(nama: String, prodi: String): Karyawan

    @Insert
    fun insertAll(vararg mahasiswa: Karyawan)

    @Delete
    fun delete(mahasiswa: Karyawan)
}
