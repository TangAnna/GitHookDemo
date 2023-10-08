package com.anna.githookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anna.githookdemo.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}
