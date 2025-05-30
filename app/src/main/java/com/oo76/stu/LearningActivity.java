package com.oo76.stu;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class LearningActivity extends AppCompatActivity {

    private VideoView videoView;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        ImageView image = findViewById(R.id.imageView);
        TextView title = findViewById(R.id.titleText);
        Button playAudio = findViewById(R.id.btnAudio);
        Button stopAudio = findViewById(R.id.btnStop);
        Button playVideo = findViewById(R.id.btnVideo);
        videoView = findViewById(R.id.videoView);

        title.setText("آموزش ساخت اکتیویتی در اندروید");
        image.setImageResource(R.drawable.education); // تصویر داخل drawable

        playAudio.setOnClickListener(v -> {
            mediaPlayer = MediaPlayer.create(this, R.raw.audio_sample); // ویس داخل raw
            mediaPlayer.start();
        });

        stopAudio.setOnClickListener(v -> {
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;
            }
        });

        playVideo.setOnClickListener(v -> {
            Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video_sample); // ویدیو داخل raw
            videoView.setVideoURI(videoUri);
            videoView.start();
        });
    }
}