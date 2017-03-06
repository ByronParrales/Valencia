package com.facci.mantatourist;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Presentacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);

        new Handler ().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Presentacion.this, SeleccionPais.class );
                startActivity(intent);

            }
        },3000);
    }
}
