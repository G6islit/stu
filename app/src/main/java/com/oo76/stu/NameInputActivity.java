package com.oo76.stu;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class NameInputActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_input);

        EditText editName = findViewById(R.id.editName);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            String name = editName.getText().toString().trim();
            if (!name.isEmpty()) {
                SharedPreferences prefs = getSharedPreferences("user", MODE_PRIVATE);
                prefs.edit().putString("username", name).apply();

                Toast.makeText(this, "سلام " + name + " عزیز!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "لطفاً نام خود را وارد کنید", Toast.LENGTH_SHORT).show();
            }
        });
    }
}