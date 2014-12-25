/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author zerokull
 */
public class Empresa {
    private Empleado empleados[] = new Empleado[100];
    private int contador =0;
    
    public boolean agregarEmpleado(String name, String tipo){
        if(contador<empleados.length){
            empleados[contador++] = new Empleado(name, tipo);
            return true;
        }
        return false;
    }
}
