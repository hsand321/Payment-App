package com.example.paymentapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.paymentapp.R;

public class RecoveryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery);

    }
    @Override
    public void onBackPressed() {
        Intent goMasuk = new Intent(RecoveryActivity.this, LoginActivity.class);
        startActivity(goMasuk);
        finish();
    }
}