package com.company;

public class Persona {
    private String nombre;
    private int edad;
    private String ocupacion;
    private String numeroTelefono;


    public Persona(String nombre, int edad, String ocupacion, String numeroTelefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public String getOcupacion() {return ocupacion;}
    public void setOcupacion(String ocupacion) {this.ocupacion = ocupacion;}

    public String getNumeroTelefono() {return numeroTelefono;}
    public void setNumeroTelefono(String numeroTelefono) {this.numeroTelefono = numeroTelefono;}

}
