package com.example.praktekandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val npmEditText = findViewById<EditText>(R.id.npmEditText)
        val jurusanEditText = findViewById<EditText>(R.id.jurusanEditText)
        val domisiliEditText = findViewById<EditText>(R.id.domisiliEditText)
        val semesterEditText = findViewById<EditText>(R.id.semesterEditText)

        simpanButton.setOnClickListener {
            Toast.makeText(this, "Hai",Toast.LENGTH_SHORT).show()

            val nama = namaEditText.text.toString()
            val npm = npmEditText.text.toString().toInt()
            val jurusan = jurusanEditText.text.toString()
            val domisili = domisiliEditText.text.toString()
            val semester = semesterEditText.text.toString().toInt()

            val intent = Intent ( this,HasilActivity::class.java)
            intent.putExtra("Nama", nama)
            intent.putExtra("Npm", npm)
            intent.putExtra("Jurusan", jurusan)
            intent.putExtra("Domisili", domisili)
            intent.putExtra("Semester", semester)
            startActivity(intent)
        }

        batalButton.setOnClickListener {
            finish()
        }
    }
}