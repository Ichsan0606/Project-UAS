package com.UAS.apps

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

interface DepartemenPbk {
    @Query("SELECT * FROM Departemen")
    fun getAll(): List<cuti>

    @Query("SELECT * FROM Depesrtemen WHERE kode_departemen IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Departemen>

    @Query("SELECT * FROM Departement WHERE nama_departemen LIKE :nama_departemen AND " +
            "prodi LIKE :prodi LIMIT 1")
    fun findByName(nama: String, prodi: String): Departemen

    @Insert
    fun insertAll(vararg nama_departemen: Departemen)

    @Delete
    fun delete(nama_departemen: Departemen)
}
