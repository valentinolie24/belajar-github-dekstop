package com.si5a.simulatorjackie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.si5a.simulatorjackie.R;

public class MainActivity extends AppCompatActivity {
    // deklarasi
    EditText etNomorPendaftaran, etNama;
    Button btnDaftar, btnLogin;
    String nomorPendaftaran, nama;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreate adalah method yang akan di jalankan pertama kali dalam baris coding
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        etNama = findViewById(R.id.et_nama);
        btnDaftar = findViewById(R.id.btn_daftar);
        btnLogin = findViewById(R.id.btn_login);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomorPendaftaran = etNomorPendaftaran.getText().toString();
                nama = etNama.getText().toString();
                if (nomorPendaftaran.trim().equals("")){
                    etNomorPendaftaran.setError("Nomor pendaftaran harus diisi!");
                }
                else if (nama.trim().equals("")){
                    etNama.setError("Nama harus diisi!");
                }
                else {
                    Toast.makeText(MainActivity.this, "Selamat"+ nama + "berhasil terdaftar", Toast.LENGTH_SHORT).show();
                }
            }
        });
        
    }
}