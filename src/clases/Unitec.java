/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author zerokull
 */
public class Unitec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        //Declaremos e instanciemos un objeto de
        //la clase Alumno
        Alumno ken = new Alumno();
        ken.print();
        
        Alumno rodri = new Alumno(25481365, "Jose Rodriguez");
        rodri.setPromedio(80);
        rodri.print();
        
        //Arreglo de alumnos-----------------
        Alumno alumnos[] = new Alumno[100];
        alumnos[0] = new Alumno(8, "Luis");
        alumnos[0].setPromedio(96);
        alumnos[0].print();
        */
        
        //Universidad
        Universidad unitec = new Universidad("UNITEC", 200);
        while(true){
            System.out.printf("1-Agregar Alumno\n2-Imprimir datos de Alumnos\n4-Salir\n");
            System.out.print("Seleccione opcion:");
            int opt = scan.nextInt();
            if(opt==4){
                break;
            }
            switch(opt){
                case 1: 
                    System.out.print("Ingrese numero de cuenta: ");
                    int num = scan.nextInt();
                    System.out.print("Ingrese Nombre: ");
                    String nom = scan.next();
                    if(unitec.agregarAlumno(num, nom)){
                        System.out.println("Alumno agregado exitosamente!");
                    }else{
                        System.out.println("Ya existe un alumno con ese numero de cuenta!");
                    }
                break;
                case 2: unitec.print(); break;
            }
        }
    }
}
