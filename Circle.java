/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicos1;

/**
 *
 * @author selissma
 */
public class Circle extends Shapes{
    private double radio;
    
    
    public Circle (double radio){
       this.radio=radio;
    }
   
    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
  
      
    @Override
    public double calculatePerimetro(){
       return 2 * Math.PI * radio;
    }
    @Override
    public String toString(){
        return "El area del circulo con el radio " + this.radio + " es " + this.calculateArea() +
                " y su perimetro es " + this.calculatePerimetro();
    }
}
