package com.oo76.stu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class NameInputActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_input);

        EditText nameEdit = findViewById(R.id.nameEdit);
        Button btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(v -> {
            String name = nameEdit.getText().toString().trim();
            Intent intent = new Intent(NameInputActivity.this, com.oo76.stu.ProfileActivity.class);
            intent.putExtra("username", name);
            startActivity(intent);
        });
    }
}