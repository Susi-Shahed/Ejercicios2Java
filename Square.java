/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicos1;

/**
 *
 * @author selissma
 */
public class Square extends Shapes{
    double lado;
    
    public Square (double lado){
    this.lado=lado;
    }
    
    @Override
    public double calculateArea(){
        return lado * lado;
    }
    @Override
    public double calculatePerimetro(){
        return lado *4;
    }
     @Override
    public String toString(){
        return "El area del cuadrado de lado " + this.lado + " es " + this.calculateArea() +
                " y su perimetro es " + this.calculatePerimetro();
    }
}
