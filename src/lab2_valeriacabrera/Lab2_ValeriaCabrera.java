/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_valeriacabrera;

import java.util.ArrayList;
import java.util.HashSet;
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
        int opcion=0,cont=0,contg=0;
        boolean flag=false;
        
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
            
            
            //validacion del login
            if(opcion==3){
                flag=true;
                
                
            }else{
                while(opcion!=3){
                    System.out.println("No ha hecho el log in aun");
                    System.out.println("Ingrese el numero de la opcion que desea ingresar: ");
                    opcion=leer.nextInt();
                }
                flag=true;
                
            }
            
            while(flag){
                
                    flag=false;
                    
                    System.out.println("Usuario: ");
                    String usuario = leer.next();
                    while(!usuario.equals("leobanegas") ){
                        System.out.println("El usuario es incorrecto");
                        System.out.println("Usuario: ");
                        usuario = leer.next();
                        
                    }
                    System.out.println("Contraseña: ");
                    int pass = leer.nextInt();
                    while(pass!=99){
                        System.out.println("La contraseña es incorrecta");
                        System.out.println("Contraseña: ");
                        pass = leer.nextInt();
                    }
                    
                    
                    
                    
            }
            
            
            
        
        
        
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
            System.out.println("Ingrese el numero de la opcion que desea ingresar: ");
            opcion=leer.nextInt();
            
            
            switch(opcion){
                
                case 1:{
                    
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nom = leer.next();
                    
                    System.out.println("Ingrese el apellido del empleado: ");
                    String apellido = leer.next();
                    
                    empleados.add(new InfodeEmpleados(nom,apellido));
                    
                    System.out.println("Ingrese color favorito: ");
                    String color = leer.next();
                    ((InfodeEmpleados) empleados.get(cont)).setfavColor(color);
                    
                    System.out.println("Ingrese edad: ");
                    int edad = leer.nextInt();
                    ((InfodeEmpleados) empleados.get(cont)).setEdad(edad);
                    
                    System.out.println("Ingrese genero (f/m): ");
                    char gen = leer.next().charAt(0);
                    ((InfodeEmpleados) empleados.get(cont)).setGenero(gen);
                    
                    System.out.println("Ingrese altura: ");
                    float alt = leer.nextFloat();
                    ((InfodeEmpleados) empleados.get(cont)).setAltura(alt);
                    
                    System.out.println("Ingrese peso: ");
                    float peso = leer.nextFloat();
                    ((InfodeEmpleados) empleados.get(cont)).setPeso(peso);
                    
                    System.out.println("Ingrese titulo: ");
                    String titulo = leer.next();
                    ((InfodeEmpleados) empleados.get(cont)).setTitulo(titulo);
                    
                    System.out.println("Cargo");
                    System.out.println("1) gerente");
                    System.out.println("2) aseador");
                    System.out.println("3) cajero");
                    System.out.println("4) seguridad");
                    System.out.println("Ingrese el numero del cargo: ");
                    int car = leer.nextInt();
                    
                    while(contg>3){
                        System.out.println("Lo siento, ya contamos con 3 gerentes");
                        System.out.println("Cargo");
                        System.out.println("1) gerente");
                        System.out.println("2) aseador");
                        System.out.println("3) cajero");
                        System.out.println("4) seguridad");
                        System.out.println("Ingrese el numero del cargo: ");
                        car = leer.nextInt();
                        
                    }
                    
                    if(car==1){
                        ((InfodeEmpleados) empleados.get(cont)).setCargo("Gerente");
                        contg++;
                    }else if(car==2){
                        ((InfodeEmpleados) empleados.get(cont)).setCargo("Aseador");
                    }else if(car==3){
                        ((InfodeEmpleados) empleados.get(cont)).setCargo("Cajero");
                    }else if(car==4){
                        ((InfodeEmpleados) empleados.get(cont)).setCargo("Seguridad");
                    }
                    
                    cont++;
                }
                break;
                case 2:{
                    
                    System.out.println("Ingrese el numero de la posicion del empleado que desea despedir:");
                    int p = leer.nextInt();
                    empleados.remove(p);
                    
                }
                break;
                
                case 3:{
                    
                    //solo para que no imprima el mensaje cuando el numero es diferente
                    
                }
                break;
                case 4:{
                    
                    
                    
                }
                break;
                case 5:{
                    
                    
                    
                }
                break;
                case 6:{
                    
                    
                }
                break;
                case 7:{
                    
                    
                }
                case 8:{
                    //solo para que no muestre el mensaje
                }
                break;
                default:
                    System.out.println("Asegurese de ingresar una de las opciones de la lista: ");
                    break;
                
            }//fin del switch
            
        }//fin del while
        
        
    }
    
    
    
}
