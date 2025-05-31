package com.oo76.stu;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnName = findViewById(R.id.btnName);
        Button btnWeb = findViewById(R.id.btnWeb);
        Button btnGpa = findViewById(R.id.btnGpa);
        Button btnProfile = findViewById(R.id.btnProfile);
        Button btnAbout = findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(v -> startActivity(new Intent(this, AboutActivity.class)));

        btnName.setOnClickListener(v ->
                startActivity(new Intent(this, NameInputActivity.class)));

        btnWeb.setOnClickListener(v ->
                startActivity(new Intent(this, WebActivity.class)));

        btnGpa.setOnClickListener(v ->
                startActivity(new Intent(this, GpaActivity.class)));

        btnProfile.setOnClickListener(v -> {
            SharedPreferences prefs = getSharedPreferences("user", MODE_PRIVATE);
            String username = prefs.getString("username", "کاربر تست");

            Intent intent = new Intent(this, ProfileActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        });
    }
}