/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicos1;

/**
 *
 * @author selissma
 */
public class FionacciRecu {
    public static void main(String[] args) {
        int maxCount = 20;
        for (int i = 0; i <= maxCount; i++) {
            int fibonacciNumber = printFibonacci(i);
            System.out.print(" " + fibonacciNumber);
        }
        }
        public static int printFibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return printFibonacci(n - 1) + printFibonacci(n - 2);
        }
    
}

