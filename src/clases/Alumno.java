/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author zerokull
 */
public class Alumno {
    //atributos que son caracteristicas que
    //describen la clase
    private int numero, edad;
    public String nombre;
    public double promedio;
    public char genero;
    public boolean matriculado;
    
    //Constructor
    public Alumno(){
        promedio=0;
        matriculado=false;
        nombre="Pendiente";
        System.out.println("SE LLAMO EL CONSTRUCTOR");
    }
    
    public Alumno(int numero, String nombre){
        this.numero=numero;
        this.nombre=nombre;
    }
}
