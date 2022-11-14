/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicos1;

import java.util.ArrayList;

/**
 *
 * @author selissma
 */
public class Supermarket {
    ArrayList<Products> inventory;
    
    public Supermarket()
    {
        inventory = new ArrayList();
    }
    
    public void addProduct(Products producto)
    {
        inventory.add(producto);
    }
    
    public ArrayList<Products> getInventory()
    {
        return inventory;
    }
    
    public static void main(String [] args){
    Products p1 = new Products("Tomato",1.50);
    Products p2 = new Products("Potato",2);
    Products p3 = new Products("lettuce",1.20);
    Products p4 = new Products("Avocado",2.90);
    Products p5 = new Products("Watermelon",5);
    Supermarket sp = new Supermarket();
    
    sp.addProduct(p1);
    sp.addProduct(p2);
    sp.addProduct(p3);
    sp.addProduct(p4);
    sp.addProduct(p5);
    sp.getInventory().add(p5);

    for(Products p : sp.getInventory())
       System.out.println(p.toString());
    }  
}
