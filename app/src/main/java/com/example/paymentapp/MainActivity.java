package com.example.paymentapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.paymentapp.fragment.HistoryFragment;
import com.example.paymentapp.fragment.HomeFragment;
import com.example.paymentapp.fragment.PaymentFragment;
import com.example.paymentapp.fragment.SettingsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView = findViewById(R.id.bottomNavView);

        navigationView.setSelectedItemId(R.id.navigation_home);

        navigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_home:
                    startActivity(new Intent(getApplicationContext(),
                            HomeFragment.class));
                    overridePendingTransition(0,0);
                    return true;
                case R.id.navigation_pay:
                    startActivity(new Intent(getApplicationContext(),
                            PaymentFragment.class));
                    overridePendingTransition(0,0);
                    return true;
                case R.id.navigation_history:
                    startActivity(new Intent(getApplicationContext(),
                            HistoryFragment.class));
                    overridePendingTransition(0,0);
                    return true;
                case R.id.navigation_settings:
                    startActivity(new Intent(getApplicationContext(),
                            SettingsFragment.class));
                    overridePendingTransition(0,0);
                    return true;

            }
            return false;
        });


    }
}