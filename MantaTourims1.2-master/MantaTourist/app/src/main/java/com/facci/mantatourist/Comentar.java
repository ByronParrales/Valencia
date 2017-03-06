package com.facci.mantatourist;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Comentar extends AppCompatActivity {
    Button btncomentar, btnmostrarcomentario;
    EditText etmail, et1;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentar);

        btncomentar = (Button)findViewById(R.id.btncomentar);
        et1 = (EditText)findViewById(R.id.et1);
        etmail = (EditText)findViewById(R.id.etEmail);
        mp = MediaPlayer.create(this, R.raw.clic);

    }
    public void Btncomentar (View view){
        BaseDeDatos admin=new BaseDeDatos(this,"Iniciando",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String email=etmail.getText().toString();
        String comentar=et1.getText().toString();

        ContentValues values=new ContentValues();
        values.put("email",email);
        values.put("comentar",comentar);
        db.insert("comentario",null,values);
        db.close();

        Intent ven=new Intent(this, Explorar.class);

    }

    public void Btnmostrarcomentario (View view){

    }
}
