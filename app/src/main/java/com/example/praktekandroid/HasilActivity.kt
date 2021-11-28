package com.example.praktekandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_activty)

        val nama = intent.getStringExtra("Nama")
        val npm = intent.getIntExtra("Npm", 0)
        val jurusan = intent.getStringExtra("Jurusan")
        val domisili = intent.getStringExtra("Domisili")
        val semester = intent.getIntExtra("Semester", 0)

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val npmTextView = findViewById<TextView>(R.id.npmTextView)
        val jurusanTextView = findViewById<TextView>(R.id.jurusanTextView)
        val domisiliTextView = findViewById<TextView>(R.id.domisiliTextView)
        val semesterTextView = findViewById<TextView>(R.id.semesterTextView)

        namaTextView.setText(nama)
        npmTextView.setText(npm.toString())
        jurusanTextView.setText(jurusan)
        domisiliTextView.setText(domisili)
        semesterTextView.setText(semester.toString())
    }
}