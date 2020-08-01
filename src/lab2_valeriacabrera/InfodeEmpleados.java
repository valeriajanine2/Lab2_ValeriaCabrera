/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_valeriacabrera;

import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class InfodeEmpleados {
    
    //atributos
    private String nombre;
    private String apellido;
    private String favColor;
    private int edad;
    private char genero;
    private float altura;
    private float peso;
    private String titulo;
    private String cargo;
    private int sueldo;
    
    //constructor
    public InfodeEmpleados(String nombre, String apellido){
        
        this.nombre=nombre;
        this.apellido=apellido;
        
    }
    
    //setters
    
    public void setApellido(String ap){
        
        this.apellido=ap;
        
    }
    
    public void setfavColor(String c){
        
        this.favColor=c;
        
    }
    
    public void setEdad(int ed){
        
        this.edad=ed;
        
    }
    
    public void setGenero(char gen){
        
        this.genero=gen;
        
    }
    
    public void setAltura(float alt){
        
        this.altura=alt;
        
    }
    
    public void setPeso(float pe){
        
        this.peso=pe;
        
    }
    
    public void setTitulo(String t){
        
        this.titulo=t;
        
    }
    
    public void setCargo(String car){
        
        this.cargo=car;
        
    }
    
    public void setSueldo(int suel){
        this.sueldo=suel;
    }
    
    //getters
    
    public String getApellido(){
        return apellido;
    }
    
    public String getfavColor(){
        return favColor;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public char getGenero(){
        return genero;
    }
    
    public float getAltura(){
        return altura;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public int getSueldo(){
        return sueldo;
    }
    
    public String toString(){
        return "Empleado: "+nombre+" "+apellido+" -"+cargo;
    }
    
}
