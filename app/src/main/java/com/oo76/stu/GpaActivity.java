package com.oo76.stu;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class GpaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        EditText score1 = findViewById(R.id.score1);
        EditText score2 = findViewById(R.id.score2);
        EditText score3 = findViewById(R.id.score3);
        Button btnCalculate = findViewById(R.id.btnCalculate);
        TextView result = findViewById(R.id.resultText);

        btnCalculate.setOnClickListener(v -> {
            try {
                float s1 = Float.parseFloat(score1.getText().toString());
                float s2 = Float.parseFloat(score2.getText().toString());
                float s3 = Float.parseFloat(score3.getText().toString());

                float avg = (s1 + s2 + s3) / 3;
                result.setText("معدل شما: " + avg);
            } catch (Exception e) {
                Toast.makeText(this, "لطفاً تمام نمرات را به درستی وارد کنید", Toast.LENGTH_SHORT).show();
            }
        });
    }
}