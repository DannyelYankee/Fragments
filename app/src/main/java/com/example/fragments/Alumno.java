package com.example.fragments;

public class Alumno {
    private String name;
    private String apellido;
    private int edad;
    private int id;

    public Alumno(String pName, String pApellido, int pEdad, int pId) {
        this.name = pName;
        this.apellido = pApellido;
        this.edad = pEdad;
        this.id = pId;
    }

    public String getName() {
        return this.name;
    }

    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }

    public int getId(){
        return this.id;
    }
}
