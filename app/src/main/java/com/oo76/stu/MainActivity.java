package com.oo76.stu;

import android.content.Intent;
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
        Button btnLearn = findViewById(R.id.btnLearn);
        Button btnProfile = findViewById(R.id.btnProfile);

        btnName.setOnClickListener(v -> startActivity(new Intent(this, NameInputActivity.class)));
        btnWeb.setOnClickListener(v -> startActivity(new Intent(this, WebActivity.class)));
        btnGpa.setOnClickListener(v -> startActivity(new Intent(this, GpaActivity.class)));
        btnLearn.setOnClickListener(v -> startActivity(new Intent(this, LearningActivity.class)));

        Intent intent = new Intent(this, com.oo76.stu.ProfileActivity.class);
        intent.putExtra("username", "کاربر تست");
        btnProfile.setOnClickListener(v -> startActivity(intent));
    }
}