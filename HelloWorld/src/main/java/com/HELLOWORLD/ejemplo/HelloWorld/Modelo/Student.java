package com.HELLOWORLD.ejemplo.HelloWorld.Modelo;

public class Student {

    private String id;
    private String nombre;
    private int edad;

    //*Constructor */

    public Student(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    //*Getters Setters */
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
