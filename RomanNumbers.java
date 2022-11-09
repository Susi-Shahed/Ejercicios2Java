/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicos1;

import java.util.Scanner;

/**
 *
 * @author selissma
 */
public class RomanNumbers {
    public static void main(String [] args){
        
        Scanner write = new Scanner(System.in);
        System.out.println("Type a Roman number: ");
        String roman= write.nextLine();
        // mccxcic
        char RomNum[]= {' ','I','V','X','L','C','D','M'};
        int DeciNum[]= {0,1,5,10,50,100,500,1000};
        
        int number=0;
        int sumary=0;
        char letter;
        
        for(int i=0; i<roman.length(); i++){
            letter=roman.charAt(i);
            
            for(int j=0; j< RomNum.length; j++){
                
                if(letter==RomNum[j]){
                    sumary=sumary + DeciNum[j];
                    
                    if(number<DeciNum[j]){
                        sumary=sumary-number*2;
                        
                        number=DeciNum[j];
                    }
                    else{
                        number=DeciNum[j];
                    }
                }
            }
        }
        System.out.println(sumary);
    }
}
