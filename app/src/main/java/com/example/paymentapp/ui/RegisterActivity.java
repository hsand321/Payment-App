package com.example.paymentapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import com.example.paymentapp.MainActivity;
import com.example.paymentapp.R;

public class RegisterActivity extends AppCompatActivity {

    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        btnDaftar = findViewById(R.id.btnDaftar);
        btnDaftar.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

    }

    @Override
    public void onBackPressed() {
        Intent goMasuk = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(goMasuk);
        finish();
    }

}