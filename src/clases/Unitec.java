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
public class Unitec {
    public static void main(String[] args) {
        //Declaremos e instanciemos un objeto de
        //la clase Alumno
        Alumno ken = new Alumno();
        System.out.println("Edad Ken: "+ken.nombre+
                ", Promedio: "+ken.promedio);
        
        Alumno rodri = new Alumno(25481365, "Jose Rodriguez");
        rodri.promedio=80;
        System.out.println("Edad Ken: "+rodri.nombre+
                ", Promedio: "+rodri.promedio);
    }
}
