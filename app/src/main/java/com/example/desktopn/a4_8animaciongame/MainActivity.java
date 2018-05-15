package com.example.desktopn.a4_8animaciongame;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private SoundPool sp;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;
    private int sound10;
    private int sound11;
    private int sound12;
    private int sound13;
    private int sound14;
    private int sound15;
    private int sound16;
    private int sound00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(3, AudioManager.STREAM_MUSIC,0);
        sound1 = sp.load(getApplicationContext(),R.raw.sound1,1);
        sound2 = sp.load(getApplicationContext(),R.raw.sound2,1);
        sound3 = sp.load(getApplicationContext(),R.raw.sound3,1);
        sound4 = sp.load(getApplicationContext(),R.raw.sound4,1);
        sound5 = sp.load(getApplicationContext(),R.raw.sound5,1);
        sound6 = sp.load(getApplicationContext(),R.raw.sound6,1);
        sound7 = sp.load(getApplicationContext(),R.raw.sound7,1);
        sound8 = sp.load(getApplicationContext(),R.raw.sound8,1);
        sound9 = sp.load(getApplicationContext(),R.raw.sound9,1);
        sound10 = sp.load(getApplicationContext(),R.raw.sound10,1);
        sound11 = sp.load(getApplicationContext(),R.raw.sound11,1);
        sound12 = sp.load(getApplicationContext(),R.raw.sound12,1);
        sound13 = sp.load(getApplicationContext(),R.raw.sound13,1);
        sound14 = sp.load(getApplicationContext(),R.raw.sound14,1);
        sound15 = sp.load(getApplicationContext(),R.raw.sound15,1);
        sound16 = sp.load(getApplicationContext(),R.raw.sound16,1);
        //sound00 = sp.load(getApplicationContext(),R.raw.sound00,1);

        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);

        b1=(Button)findViewById(R.id.bt1);
        b2=(Button)findViewById(R.id.bt2);
        b3=(Button)findViewById(R.id.bt3);
        b4=(Button)findViewById(R.id.bt4);
        b5=(Button)findViewById(R.id.bt5);
        b6=(Button)findViewById(R.id.bt6);
        b7=(Button)findViewById(R.id.bt7);
        b8=(Button)findViewById(R.id.bt8);
        b9=(Button)findViewById(R.id.bt9);
        b10=(Button)findViewById(R.id.bt10);
        b11=(Button)findViewById(R.id.bt11);
        b12=(Button)findViewById(R.id.bt12);
        b13=(Button)findViewById(R.id.bt13);
        b14=(Button)findViewById(R.id.bt14);
        b15=(Button)findViewById(R.id.bt15);
        b16=(Button)findViewById(R.id.bt16);



        b1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });

        b2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });

        b3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });

        b4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });

        b5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });

        b6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });

        b7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });

        b8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });
        b9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });
        b10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });
        b11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });
        b12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });
        b13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });
        b14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });
        b15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });
        b16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.startAnimation(animScale);
                return false;
            }
        });

    }

    public void playsound1 (View v) {
        sp.play(sound1,1.0f,1.0f,0,0,1);
    }
    public void playsound2 (View v) {
        sp.play(sound2,1.0f,1.0f,0,0,1);

    }
    public void playsound3 (View v) {
        sp.play(sound3,1.0f,1.0f,0,0,1);

    }
    public void playsound4 (View v) {
        sp.play(sound4,1.0f,1.0f,0,0,1);

    }
    public void playsound5 (View v) {
        sp.play(sound5,1.0f,1.0f,0,0,1);

    }
    public void playsound6 (View v) {
        sp.play(sound6,1.0f,1.0f,0,0,1);

    }
    public void playsound7 (View v) {
        sp.play(sound7,1.0f,1.0f,0,0,1);

    }
    public void playsound8 (View v) {
        sp.play(sound8,1.0f,1.0f,0,0,1);

    }
    public void playsound9 (View v) {
        sp.play(sound9,1.0f,1.0f,0,0,1);

    }
    public void playsound10 (View v) {
        sp.play(sound10,1.0f,1.0f,0,0,1);

    }
    public void playsound11 (View v) {
        sp.play(sound11,1.0f,1.0f,0,0,1);

    }
    public void playsound12 (View v) {
        sp.play(sound12,1.0f,1.0f,0,0,1);

    }
    public void playsound13 (View v) {
        sp.play(sound13,1.0f,1.0f,0,0,1);

    }
    public void playsound14 (View v) {
        sp.play(sound14,1.0f,1.0f,0,0,1);

    }
    public void playsound15 (View v) {
        sp.play(sound15,1.0f,1.0f,0,0,1);

    }
    public void playsound16 (View v) {
        sp.play(sound16,1.0f,1.0f,0,0,1);

    }
}
