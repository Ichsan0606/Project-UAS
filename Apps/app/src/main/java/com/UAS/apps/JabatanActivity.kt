package com.UAS.apps

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.UAS.apps.Database.ApproomDB
import com.UAS.apps.EditJabatanActivity
import com.UAS.apps.R
import kotlinx.android.synthetic.main.activity_jabatan.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class JabatanActivity : AppCompatActivity() {

    val db by lazy { ApproomDB(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jabatan)
        setupListener()
    }

    override fun onStart() {
        super.onStart()
        CoroutineScope(Dispatchers.IO).launch {
            val allJabatan = db.JabatanPbk().getAllJabatan()
            Log.d("JabatanActivity", "dbResponse: $allJabatan")
        }
    }

    fun setupListener() {
        btn_createJabatan.setOnClickListener {
            startActivity(Intent(this, EditJabatanActivity::class.java))
        }
    }
}