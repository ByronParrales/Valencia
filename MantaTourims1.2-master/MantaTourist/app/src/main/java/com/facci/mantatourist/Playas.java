package com.facci.mantatourist;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Playas extends AppCompatActivity {
    Button btn1, btn2, btn3;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playas);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);

        mp = MediaPlayer.create(this, R.raw.clic);
    }

    public void playa (View view){
        mp.start();

    }

    public void playa2 (View view){
        mp.start();

    }

    public void playa3 (View view){
        mp.start();

    }
}
