package com.yosha10.belajarexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    // Deklarasi Variabel
    TextView tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Mengubah Judul Di Layar
        getSupportActionBar().setTitle("Second Layout");

        // Mengambil tag yang ada di second_main
        tvNama = findViewById(R.id.tv_nama);

        // Menangkap variabel yang dikirim dengan getIntent
        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");

        // Menset textview Nama
        tvNama.setText(yNama);
    }
}