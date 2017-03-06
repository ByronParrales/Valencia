package com.facci.mantatourist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by steev on 5/3/2017.
 */

public class BaseDeDatos extends SQLiteOpenHelper {
    public BaseDeDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table email(codigo integer primary key autoincrement, email text, contraseña text)");
        db.execSQL("Create table comentario(codigo integer primary key autoincrement, email text, comentario text)");
        db.execSQL("insert into email values('prueba@gmail.com','prueba')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Create table email(codigo integer primary key autoincrement, email text, contraseña text)");
        db.execSQL("Create table comentario(codigo integer primary key autoincrement, email text, comentario text)");
        db.execSQL("insert into email values('prueba@gmail.com','prueba')");
    }
}
