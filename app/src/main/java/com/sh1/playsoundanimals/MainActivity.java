package com.sh1.playsoundanimals;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    String[] animals;
    ArrayAdapter<String> animalsAdapter;
    HashMap<String, Integer> map;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        map = new HashMap<String, Integer>();
        map.put("Gallo",R.raw.gallo);
        map.put("Gato",R.raw.gato);
        map.put("Leon",R.raw.leon);
        map.put("Caballo",R.raw.caballo);
        map.put("Burro",R.raw.burro);
        map.put("Elefante",R.raw.elefante);
        map.put("Mono",R.raw.mono);
        map.put("Pajaro",R.raw.pajaro);
        map.put("Perro",R.raw.perro);
        map.put("Vaca",R.raw.vaca);
        animals = new String[]{"Gallo","Gato","Leon","Caballo","Burro","Elefante","Mono","Pajaro","Perro","Vaca"};
        animalsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,animals);
        spinner.setAdapter(animalsAdapter);
    }
    public void Sound(View v){
        MediaPlayer mp = MediaPlayer.create(this,map.get(spinner.getSelectedItem().toString()));
        mp.start();
    }
}