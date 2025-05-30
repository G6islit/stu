package com.oo76.stu;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class GpaActivity extends AppCompatActivity {
    EditText grade1, unit1, grade2, unit2, grade3, unit3;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        grade1 = findViewById(R.id.grade1);
        unit1 = findViewById(R.id.unit1);
        grade2 = findViewById(R.id.grade2);
        unit2 = findViewById(R.id.unit2);
        grade3 = findViewById(R.id.grade3);
        unit3 = findViewById(R.id.unit3);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(v -> {
            try {
                double g1 = Double.parseDouble(grade1.getText().toString());
                int u1 = Integer.parseInt(unit1.getText().toString());
                double g2 = Double.parseDouble(grade2.getText().toString());
                int u2 = Integer.parseInt(unit2.getText().toString());
                double g3 = Double.parseDouble(grade3.getText().toString());
                int u3 = Integer.parseInt(unit3.getText().toString());

                double total = (g1 * u1 + g2 * u2 + g3 * u3);
                int units = u1 + u2 + u3;
                double gpa = total / units;

                new AlertDialog.Builder(GpaActivity.this)
                        .setTitle("معدل نهایی")
                        .setMessage("معدل شما: " + String.format("%.2f", gpa))
                        .setPositiveButton("باشه", null)
                        .show();

            } catch (Exception e) {
                new AlertDialog.Builder(GpaActivity.this)
                        .setTitle("خطا")
                        .setMessage("لطفاً تمام فیلدها را درست وارد کنید")
                        .setPositiveButton("باشه", null)
                        .show();
            }
        });
    }
}