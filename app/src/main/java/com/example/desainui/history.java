package com.example.desainui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }

    public void pindahkeberanda(View view) {
        Intent intent = new Intent(history.this,Beranda.class);
        startActivity(intent);
    }
}