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
    private String nombre;
    private double promedio;
    private char genero;
    private boolean matriculado;
    
    //Constructor
    public Alumno(){
        this(0,"Pendiente");
        System.out.println("SE LLAMO EL CONSTRUCTOR SIN PARAMETROS");
    }
    
    public Alumno(int numero, String nombre){
        this.numero=numero;
        this.nombre=nombre;
        promedio=0;
        matriculado=false;
        System.out.println("SE LLAMO EL CONTRUCTOR CON PARAMETROS");
    }
    
    //FUNCIONES ------------------------------------------------
    //FORMATO: identificador_Acceso tipo_funcion id(parametros*)
    
    //Funciones set
    public void setPromedio(double promedio){
        //instrucciones
        this.promedio=promedio;
    }
    
    public void setNombre(String nombre){
        //instrucciones
        this.nombre=nombre;
    }
    
    //Funciones get
    /*3 reglas de Goches
    Formato: return EXPR
    1- Retornar un valor compatible con el tipo de la funtion (-Incompatible types-)
    2- SIEMPRE retornar algo. no importando cuantos caminos tenga la funcion (-Missing return statement-)
    3- Nunca poner codigos inmediatamente despues de un return (-unreacheble statement-)
    */
    public String getNombre(){
        return nombre;
    }
    
    public double getPromedio(){
        return promedio;
    }
}
