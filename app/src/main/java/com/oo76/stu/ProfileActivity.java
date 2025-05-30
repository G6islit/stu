package com.oo76.stu;


import com.oo76.stu.adapter.ProfileAdapter;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ListView listView = findViewById(R.id.profileList);
        String username = getIntent().getStringExtra("username");

        List<ProfileItem> profileItems = new ArrayList<>();

        profileItems.add(new com.oo76.stu.ProfileItem(R.drawable.user, "نام کاربر", username));
        profileItems.add(new com.oo76.stu.ProfileItem(R.drawable.school, "رشته تحصیلی", "مهندسی نرم‌افزار"));
        profileItems.add(new com.oo76.stu.ProfileItem(R.drawable.welcome, "پیام", "خوش آمدید به اپلیکیشن آموزشی"));

        ProfileAdapter adapter = new ProfileAdapter(this, profileItems);

        new AlertDialog.Builder(this)
                .setTitle("ذخیره اطلاعات")
                .setMessage("می‌خواهید اطلاعات پروفایل ذخیره شود؟")
                .setPositiveButton("بله", (dialog, which) -> dialog.dismiss())
                .setNegativeButton("خیر", (dialog, which) -> dialog.dismiss())
                .show();
    }
}