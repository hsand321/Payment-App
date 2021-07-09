package com.example.paymentapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.paymentapp.MainActivity;
import com.example.paymentapp.R;

public class LoginActivity extends AppCompatActivity {

    TextView tvLupaAkun, tvBuatAkun;
    EditText etId, etPassword;
    Button btnMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnMasuk = findViewById(R.id.btnMasuk);
        tvBuatAkun = findViewById(R.id.tvBuatAkun);
        tvLupaAkun = findViewById(R.id.tvLupaAkun);
        etId = findViewById(R.id.etId);
        etPassword = findViewById(R.id.etPassword);

        tvBuatAkun.setOnClickListener(v -> {
            Intent goBuatAkun = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(goBuatAkun);
            finish();
        });
        tvLupaAkun.setOnClickListener(v -> {
            Intent goLupaAkun = new Intent(LoginActivity.this, RecoveryActivity.class);
            startActivity(goLupaAkun);
            finish();
        });
        btnMasuk.setOnClickListener(v -> {
            Intent intent = new Intent (LoginActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}