/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_valeriacabrera;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Lab2_ValeriaCabrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //importar scanner
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        
        //ArrayList
        ArrayList empleados = new ArrayList();
        
        
        //Menu
        int opcion=0;
        while(opcion!=8){
            
            System.out.println("Menu");
            System.out.println("1)Registro de Empleados");
            System.out.println("2)Despedir Empleados");
            System.out.println("3)Log in");
            System.out.println("4)Ascender Cajero");
            System.out.println("5)Listar Empleados");
            System.out.println("6)Modificar Empleados");
            System.out.println("7)RANDOM");
            System.out.println("8)Salir");
            System.out.println("Ingrese el numero de la opcion que desea agregar: ");
            opcion=leer.nextInt();
            
            
            
        }
        
        
    }
    
}
