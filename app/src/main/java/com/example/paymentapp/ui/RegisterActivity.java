package com.example.paymentapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.paymentapp.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    @Override
    public void onBackPressed() {
        Intent goMasuk = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(goMasuk);
        finish();
    }

}