package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private ImageButton cat, penguin;
    private MediaPlayer catsound, penguinsound;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    cat = findViewById(R.id.cat);
    penguin = findViewById(R.id.penguion);
    catsound = MediaPlayer.create(this, R.raw.cat);
    penguinsound = MediaPlayer.create(this, R.raw.penguin);
    cat.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        soundplaybutton(catsound);
        }
    });
    penguin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            soundplaybutton(penguinsound);
        }
    });
    }
    private void soundplaybutton(MediaPlayer sound)
    {
        if(sound.isPlaying()) {sound.stop();}
        sound.start();
        sound.setLooping(true);
       // sound.seekTo(1000);
    }


}

