package com.uts.uts1923240099;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivitySecond extends AppCompatActivity {
    private TextView tvnama, tvnp, tvjp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second);

        tvnama = findViewById(R.id.tv_nama);
        tvjp = findViewById(R.id.tv_jalur);
        tvnp = findViewById(R.id.tv_np);

        Intent intent = getIntent();
        tvnama.setText(intent.getStringExtra("vNama"));
        tvnp.setText(intent.getStringExtra("vNomor"));
        tvjp.setText(intent.getStringExtra("vJalur"));
    }
}