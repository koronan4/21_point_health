package com.example.a21_point_health;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvEmail = (TextView) findViewById(R.id.tvtEmailProfile);
        tvEmail.setText(getIntent().getExtras().getString("Email"));
    }
}
