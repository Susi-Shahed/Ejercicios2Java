/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicos1;

/**
 *
 * @author selissma
 */
public class Rectangle extends Shapes{
    double base;
    double altura;
    
    public Rectangle (double base,double altura){
        this.base=base;
        this.altura=altura;
    }
    
    @Override
    public double calculateArea(){
        return base*altura;
    }
    
    @Override
    public double calculatePerimetro(){
        return 2 * (base+altura);
    }
    
    @Override
    public String toString(){
        return "El area del rectangulo de base " + this.base + 
                " y de altura " + this.altura + " es " + this.calculateArea() +
                " y su perimetro es " + this.calculatePerimetro();
    }
}
