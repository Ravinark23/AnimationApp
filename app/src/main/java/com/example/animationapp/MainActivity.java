package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mp=MediaPlayer.create(MainActivity.this, R.raw.music);
        mp.start();
        MediaPlayer m=MediaPlayer.create(MainActivity.this, R.raw.flying_music);
        m.start();
        img=findViewById(R.id.myimg);
        img.animate().translationYBy(-1500).setDuration(15000).alpha(0.2f).setDuration(15000);
    }
}