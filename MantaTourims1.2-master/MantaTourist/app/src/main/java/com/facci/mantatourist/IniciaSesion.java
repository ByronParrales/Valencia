package com.facci.mantatourist;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IniciaSesion extends AppCompatActivity {
    TextView tvIniciar;
    EditText etNombre, etContraseña;
    Button btnIniciar, btnRegistrar, btnFacebook, btnGmail;
    CheckBox cbdata;
    MediaPlayer mp;
    private Cursor fila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicia_sesion);

        tvIniciar = (TextView)findViewById(R.id.tvIniciar);
        etNombre = (EditText)findViewById(R.id.etNombre);
        etContraseña = (EditText)findViewById(R.id.etContraseña);
        btnIniciar = (Button)findViewById(R.id.btnIniciar);
        btnRegistrar= (Button)findViewById(R.id.btnRegistrar);
        cbdata = (CheckBox)findViewById(R.id.cbdata);

        mp = MediaPlayer.create(this, R.raw.clic);

    }

    public void Iniciar (View view){
        BaseDeDatos admin=new BaseDeDatos(this,"Iniciando", null,1);
        SQLiteDatabase db=admin.getWritableDatabase();

        String email=etNombre.getText().toString();
        String contraseña=etContraseña.getText().toString();
        fila=db.rawQuery("select email,contraseña from email where email='"+email+"'and contraseña='"+contraseña+"'",null);

        while(fila.moveToFirst()==true) {
            String ema = fila.getString(0);
            String pass = fila.getString(1);
            if (email.equals(ema) && contraseña.equals(pass)) {
                Intent intentInicia = new Intent(this, Explorar.class);
                startActivity(intentInicia);
                etNombre.setText("");
                etContraseña.setText("");
            }
            else
                Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_LONG).show();
        }
    }

    public void Registrar (View view){
        mp.start();
        Intent intentregistar = new Intent(IniciaSesion.this, Registrar.class);
        startActivity(intentregistar);
    }

    public void facebook (View view){
        Intent intentfacebook = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
        startActivity(intentfacebook);
    }

    public void gmail (View view){
        Intent intentgmail = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gmail.com"));
        startActivity(intentgmail);
    }


}
