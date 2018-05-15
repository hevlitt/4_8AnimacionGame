package com.example.desktopn.a4_8animaciongame;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Anim extends AppCompatActivity {

    ImageView imageView;
    AnimationDrawable anim;
    MediaPlayer loop,mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);

        startLoop();
        mp = MediaPlayer.create(Anim.this,R.raw.tono);

        imageView = (ImageView) findViewById(R.id.img);
        imageView.setBackgroundResource(R.drawable.animation);

        anim = (AnimationDrawable) imageView.getBackground();
        anim.setOneShot(true);

        start();
        change();
    }

    public void start(){
        if (anim != null && !anim.isRunning()) {
            anim.start();
        }
        anim.start();
    }

    private void startLoop(){
        if(loop == null){
            loop = MediaPlayer.create(this, R.raw.loop);
        }
        if(!loop.isPlaying()){
            loop.setLooping(true);
            loop.start();
        }

    }

    public void change(){
        int TIME_OUT = 4000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Anim.this, MainActivity.class);
                startActivity(i);
                finish();
                loop.stop();
            }
        }, TIME_OUT);

    }
}
