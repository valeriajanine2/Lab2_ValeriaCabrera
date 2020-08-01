/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_valeriacabrera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
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
                    
                    
                    // validacion ingresar solo 3 gerentes
                    while(contg>=3 && car==1){
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
                        ((InfodeEmpleados) empleados.get(cont)).setSueldo(50000);
                        contg++;
                    }else if(car==2){
                        ((InfodeEmpleados) empleados.get(cont)).setCargo("Aseador");
                        ((InfodeEmpleados) empleados.get(cont)).setSueldo(30000);
                    }else if(car==3){
                        ((InfodeEmpleados) empleados.get(cont)).setCargo("Cajero");
                        ((InfodeEmpleados) empleados.get(cont)).setSueldo(40000);
                    }else if(car==4){
                        ((InfodeEmpleados) empleados.get(cont)).setCargo("Seguridad");
                        ((InfodeEmpleados) empleados.get(cont)).setSueldo(38000);
                    }
                    
                    cont++;
                }
                break;
                case 2:{
                    
                    System.out.println("Ingrese el numero de la posicion del empleado que desea despedir:");
                    int p = leer.nextInt();
                    empleados.remove(p);
                    
                    if(contg==0){
                        System.out.println("Ingrese la posicion del cajero que desea ascender: ");
                        int e = leer.nextInt();
                    
                    if (empleados.get(e-1) instanceof InfodeEmpleados) {
                        ((InfodeEmpleados) empleados.get(e-1)).setCargo("Gerente");
                        ((InfodeEmpleados) empleados.get(e-1)).setSueldo(50000);
                        System.out.println(empleados.get(e-1)+" ");
                    }
                    }
                    
                }
                break;
                
                case 3:{
                    
                    //solo para que no imprima el mensaje cuando el numero es diferente
                    
                }
                break;
                case 4:{
                    
                    if(contg<3){
                    System.out.println("Ingrese la posicion del cajero que desea ascender: ");
                    int p = leer.nextInt();
                    
                    if (empleados.get(p-1) instanceof InfodeEmpleados) {
                        ((InfodeEmpleados) empleados.get(p-1)).setCargo("Gerente");
                        ((InfodeEmpleados) empleados.get(p-1)).setSueldo(50000);
                        System.out.println(empleados.get(p-1)+" ");
                    }
                    
                }
                    
                    else{
                        System.out.println("Ya están ocupados todos los cargos de Gerente");
                    }
                }
                break;
                case 5:{
                    
                  for (int i = 0; i < empleados.size(); i++) {
                      
                      if (((InfodeEmpleados)empleados.get(i)).getSueldo()==50000 ) {
                          System.out.println(empleados.indexOf(empleados.get(i))+"- "+empleados.get(i));
                      }
                      
                      if (((InfodeEmpleados)empleados.get(i)).getSueldo()==30000 ) {
                          System.out.println(empleados.indexOf(empleados.get(i))+"- "+empleados.get(i));
                      }
                      
                      if (((InfodeEmpleados)empleados.get(i)).getSueldo()==40000 ) {
                          System.out.println(empleados.indexOf(empleados.get(i))+"- "+empleados.get(i));
                      }
                      
                      if (((InfodeEmpleados)empleados.get(i)).getSueldo()==38000 ) {
                          System.out.println(empleados.indexOf(empleados.get(i))+"- "+empleados.get(i));
                      }
        }
                    
                }
                break;
                case 6:{
                    
                    //modificacion
                    
                    System.out.println("Ingrese la posicion del empleado que desea modificar: ");
                    int p = leer.nextInt();
                    
                    System.out.println("Modificar: ");
                    System.out.println("1) Color Favorito");
                    System.out.println("2) Edad");
                    System.out.println("3) Altura");
                    System.out.println("4) Peso");
                    System.out.println("Ingrese el numero que desea modificar: ");
                    int mod = leer.nextInt();
                    
                    if(mod==1){
                        System.out.println("Ingrese el nuevo color: ");
                        String color = leer.next();
                        ((InfodeEmpleados) empleados.get(p)).setfavColor(color);
                    }else if(mod==2){
                        System.out.println("Ingrese la nueva edad: ");
                        int edad = leer.nextInt();
                        ((InfodeEmpleados) empleados.get(p)).setEdad(edad);
                    }else if(mod==3){
                        System.out.println("Ingrese la nueva altura: ");
                        float altura = leer.nextFloat();
                        ((InfodeEmpleados) empleados.get(p)).setAltura(altura);
                    }else if(mod==4){
                        System.out.println("Ingrese el nuevo color: ");
                        float peso = leer.nextFloat();
                        ((InfodeEmpleados) empleados.get(p)).setPeso(peso);
                    }
                    
                    
                    
                    
                    
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
