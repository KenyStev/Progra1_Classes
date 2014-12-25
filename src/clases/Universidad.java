package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zerokull
 */
public class Universidad {
    private String nombre;
    private Alumno alumnos[];

    public Universidad(String n, int max) {
        nombre = n;
        alumnos = new Alumno[max];
    }
    
    public int searchAlumno(int num){
        int index = -1;
        /**
         * buscar un 
         */
        for (int i=0; i<alumnos.length; i++) {
            if(alumnos[i]!=null && alumnos[i].validarNumero(num)){
                index = i;
                break;
            }
        }
        return index;
    }
    
    public boolean agregarAlumno(int num, String nom){
        /**
         * Agrega un alumno si encuentra una posicion vacia
         * en el arreglo. si lo puede agregar retorna true.
         */
        boolean agregado = false;
        for (int i = 0; i < alumnos.length; i++) {
            if(searchAlumno(num)==-1 && alumnos[i]==null){
                alumnos[i] = new Alumno(num, nom);
                agregado=true;
                break;
            }
        }
        return agregado;
    }
    
    public void print(){
        for (Alumno alumno : alumnos) {
            if(alumno!=null)
                alumno.print();
        }
    }
}
