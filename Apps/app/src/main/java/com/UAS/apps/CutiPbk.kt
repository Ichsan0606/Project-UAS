package com.UAS.apps

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

interface CutiPbk {
    @Query("SELECT * FROM Cuti")
    fun getAll(): List<cuti>

    @Query("SELECT * FROM Cuti WHERE nomor_induk IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Karyawan>

    @Query("SELECT * FROM Cuti WHERE nama LIKE :nama AND " +
            "prodi LIKE :prodi LIMIT 1")
    fun findByName(nama: String, prodi: String): Cuti

    @Insert
    fun insertAll(vararg karyawan: Cuti)

    @Delete
    fun delete(karyawan: Cuti)
}
