package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Alumno> listaAlumnos;
    private ListView listViewAlumnos;
    Alumno daniel = new Alumno("Daniel", "Juape", 21, 1);
    Alumno aritz = new Alumno("Aritz", "Zugazaga", 21, 2);
    Alumno alatz = new Alumno("Alatz", "Landeta", 21, 3);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaAlumnos = new ArrayList<Alumno>();
        listaAlumnos.add(daniel);
        listaAlumnos.add(aritz);
        listaAlumnos.add(alatz);

        ArrayAdapter adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, this.cargarDatos());
        listViewAlumnos = (ListView) findViewById(R.id.listAlumnos);
        listViewAlumnos.setAdapter(adaptador);


    }

    public String[] cargarDatos() {
        int i = 0;
        String[] datos = new String[listaAlumnos.size()];
        for (Alumno al : listaAlumnos) {
            datos[i] = "alumno " + al.getId();
            i++;
        }

        return datos;

    }
}