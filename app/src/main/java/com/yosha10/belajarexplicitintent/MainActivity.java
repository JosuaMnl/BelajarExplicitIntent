package com.yosha10.belajarexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Mendeklarasi Variabel
    Button btnPindah;
    EditText etNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mengubah Judul Di Layar
        getSupportActionBar().setTitle("First Layout");

        // Mengambil tag yang ada di activity_main
        btnPindah = findViewById(R.id.btn_pindah);
        etNama = findViewById(R.id.et_nama);

        // Membuat On Click Listener ketika tombol ditekan
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Mengambil nilai yang ada di etNama
                String nama = etNama.getText().toString();

                // Mengecek apakah input etNama sudah diisi
                if (nama.trim().equals("")){
                    etNama.setError("Nama Harus Diisi");
                } else{ // Jika tidak diisi, maka pindah ke SecondLayout
                    // Inisiasi Object dari Class Intent dan mensetting untuk berpindah ke Second Activity(parameter kedua)
                    Intent pindah = new Intent(MainActivity.this, SecondActivity.class);

                    // Mengirim variabel nama
                    pindah.putExtra("xNama", nama);

                    // Berpindah ke halaman Second Activity
                    startActivity(pindah);
                }
            }
        });
    }
}