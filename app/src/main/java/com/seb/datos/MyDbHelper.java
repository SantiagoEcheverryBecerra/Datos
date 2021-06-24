package com.seb.datos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class MyDbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME= "areas.db";

    public  MyDbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void  onCreate(SQLiteDatabase db) {
        db.execSQL("create table area (id INTEGER PRIMARY KEY, name TEXT)");
    }

    @Override
    public void  onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists area");
        onCreate(db);
    }

    public void  insertArea (SQLiteDatabase db, Area area) {
        ContentValues values = new ContentValues();

        values.put("id", area.getId());
        values.put("name",area.getName());
        db.insert("area", null, values );
    }

    public void selectArea (SQLiteDatabase db) {
        //8:55
        Cursor filas = db.rawQuery("Select * from area", null);
        if (filas.moveToFirst()){
            //do {
            //    Area area Area area1 = new Area();
        }

    }
}
