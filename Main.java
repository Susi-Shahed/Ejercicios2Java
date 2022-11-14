/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicos1;

/**
 *
 * @author selissma
 */
public class Main {
    public static void main(String[] args) {
        Circle circulo = new Circle(20.0);
        Rectangle rectangulo = new Rectangle(10.2, 20.0);
        
        System.out.println("El area del circulo es de: " + circulo.calculateArea()+" y");
        System.out.println(rectangulo.toString());
    }
}
