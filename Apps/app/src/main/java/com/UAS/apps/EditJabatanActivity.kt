package com.UAS.apps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.UAS.apps.Database.ApproomDB
import com.UAS.apps.Database.Jabatan
import kotlinx.android.synthetic.main.activity_edit_jabatan.*
import kotlinx.android.synthetic.main.activity_edit_karyawan.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class EditJabatanActivity : AppCompatActivity() {

    val db by lazy { ApproomDB(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_jabatan)
        setupListener()
    }

    fun setupListener(){
        btn_saveJabatan.setOnClickListener{
            CoroutineScope(Dispatchers.IO).launch {
                db.JabatanPbk().addJabatan(
                    Jabatan(0, txt_id.text.toString(), Integer.parseInt(txt_jabatan.text.toString()))
                )
                finish()
            }
        }
    }
}