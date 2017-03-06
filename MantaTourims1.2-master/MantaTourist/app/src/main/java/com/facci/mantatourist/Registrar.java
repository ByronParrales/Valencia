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
import android.widget.TextView;
import android.widget.Toast;

public class Registrar extends AppCompatActivity {

    TextView tvRegistro;
    EditText etCedula, etEmail, etPassword;
    Button btnGuardarReg, btnCuenta;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        tvRegistro = (TextView) findViewById(R.id.tvRegistro);
        etCedula = (EditText) findViewById(R.id.etCedula);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnGuardarReg = (Button) findViewById(R.id.btnGuardarReg);
        btnCuenta = (Button) findViewById(R.id.btnCuenta);
    }
    public void BtnGuardarReg(View view){
        BaseDeDatos admin=new BaseDeDatos(this,"Iniciando",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String cedula=etCedula.getText().toString();
        String email=etEmail.getText().toString();
        String contraseña=etPassword.toString().toString();

        ContentValues values=new ContentValues();
        values.put("cedula",cedula);
        values.put("email",email);
        values.put("contraseña",contraseña);
        db.insert("email",null,values);
        db.close();

        Intent ven=new Intent(this,IniciaSesion.class);

    }

}
       // mp = MediaPlayer.create(this, R.raw.clic);

        //final BaseDatos basedatos =new BaseDatos(getApplicationContext());

        //etCedula.setOnClickListener(new View.OnClickListener() {
        //    @Override
     //       public void onClick(View v) {

       //     }
        //});

       // etEmail.setOnClickListener(new View.OnClickListener() {
        //    @Override
         //   public void onClick(View v) {

            //}
      //  });

        //etPassword.setOnClickListener(new View.OnClickListener() {
         //   @Override
         //   public void onClick(View v) {

//            }
  //      });
//
  //      btnGuardarReg.setOnClickListener(new View.OnClickListener() {
    //        @Override
      //      public void onClick(View v) {
        //        SQLiteDatabase db = basedatos.getWritableDatabase();
        //        ContentValues valores = new ContentValues();
        //        valores.put(BaseDatos.DatosTablas.COLUMNA_CED, etCedula.getText().toString());
        //        valores.put(BaseDatos.DatosTablas.COLUMNA_CORREO, etEmail.getText().toString());
         //       valores.put(BaseDatos.DatosTablas.COLUMNA_CONTRASEÑA, etPassword.getText().toString());

//                long IdGuardado = db.insert(BaseDatos.DatosTablas.NOMBRE_TABLA, BaseDatos.DatosTablas.COLUMNA_CED,valores);
//                Toast.makeText(getApplicationContext(),"Registro Guardado: " +IdGuardado, Toast.LENGTH_LONG).show();
//
//            }
//        });

//        btnCuenta.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mp.start();
//                Intent intent = new Intent(Registrar.this, IniciaSesion.class);
//                startActivity(intent);

//            }
//        });
//    }
//}
