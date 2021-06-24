package com.seb.datos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDbHelper db = new MyDbHelper(this);
        Area area= new Area();
        area.setId(1);
        area.setName("Manizales");
        db.insertArea(db.getWritableDatabase(),area);



        //Set<String> set = new HashSet<>();
        //set.add("11");
        //set.add("12");
        //set.add("13");

        //SharedPreferences sharedPref = getSharedPreferences("Materia1", Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = sharedPref.edit();
        //editor.putString("email", "santiago.3801821071@ucaldas.edu-co");
        //editor.putString("nombre", "Santiago Echeverry Becerra");
        //editor.putStringSet("datos", set);
        //editor.commit();

        //String correo = sharedPref.getString("email", "");
        //String nombre = sharedPref.getString("nombre", "");
        //ArrayList datos = (ArrayList) sharedPref.getStringSet("datos", null);
    }

}