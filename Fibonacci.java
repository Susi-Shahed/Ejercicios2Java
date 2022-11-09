/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicos1;

/**
 *
 * @author selissma
 */
public class Fibonacci {
    public static int fibonacci(int n){
        if (n <=1){
            return n;
        }
        int PF =0; //previous fibonacci
        int CF=1; //Current fibonacci
        
        for(int i=0 ; i< n-1 ; i++){
            
            int F= PF +CF; //F >>> The result of the summary is FP and CF.
            PF = CF;
            CF = F;
        }return CF;
    }
    public static void main(String[] args){
        int n = 8;
        System.out.println("El Fibonacci es:  = " + fibonacci(n));
    }
}
