package com.company;

import java.util.Arrays;

public class DatosOcultos extends Persona{
    private String passwordFacebook;
    private String numCuentaBanco;
    private String contraCelular;

    public DatosOcultos(String nombre, int edad, String ocupacion, String numeroTelefono ,
                        String passwordFacebook, String numCuentaBanco, String contraCelular) {
        super(nombre, edad, ocupacion, numeroTelefono);
        this.passwordFacebook = passwordFacebook;
        this.numCuentaBanco = numCuentaBanco;
        this.contraCelular = contraCelular;
    }
    public String encriptar(String texto){
        char[] caracteres = texto.toCharArray(); //.toCharArray() permite dividir un string
        // por caracteres para poder almacenarlos en un arrelgo de elementos tipo char.

        //Arreglo de numeros enteros del mismo tamaño que el arreglo de caracteres.
        Integer[] num = new Integer[caracteres.length];

        //Ciclo para convertir los caracteres a su valor entero correspondiente a la tabla ASCII
        for(int i = 0; i<caracteres.length; i++){
            num[i] = (int) caracteres[i];
        }

        //Arreglo de tipo int para almacenar los numeros binarios
        Integer[] b = new Integer[num.length];
        //Convertir los numeros del arreglo num[] a binario y almacenarlos en el arreglo b[]
        for (int j = 0; j < num.length; j ++){
            b[j] = Integer.valueOf(Integer.toBinaryString(num[j]));//Convetir a su contraparte binaria
            // y despues a entero para almacenarlo en el arreglo tipo int
        }
        return Arrays.toString(b);
    }
    public String toString(){
        return "Datos\n\nDatos publicos:\nNombre:"+getNombre()+
                "\nedad: "+getEdad()+
                "\nocuapcion: "+getOcupacion()+
                "\nnumero de telefono: "+getNumeroTelefono()+
                "\n\nDatos encriptados. \nContraseña facebook:"+encriptar(passwordFacebook)+
                "\nNumero de cuenta: "+encriptar(numCuentaBanco)+
                "\nContaseña celular: "+encriptar(contraCelular);
    }

}
