package com.oo76.stu;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ListView listView = findViewById(R.id.profileList);
        String username = getIntent().getStringExtra("username");

        ArrayList<String> items = new ArrayList<>();
        items.add("نام کاربر: " + username);
        items.add("رشته تحصیلی: مهندسی نرم‌افزار");
        items.add("پیام: خوش آمدید به اپلیکیشن آموزشی");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        new AlertDialog.Builder(this)
                .setTitle("ذخیره اطلاعات")
                .setMessage("می‌خواهید اطلاعات پروفایل ذخیره شود؟")
                .setPositiveButton("بله", (dialog, which) -> dialog.dismiss())
                .setNegativeButton("خیر", (dialog, which) -> dialog.dismiss())
                .show();
    }
}