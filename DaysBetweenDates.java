/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicos1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author selissma
 */
public class Days {
    public static void main(String [] args){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate start = LocalDate.parse("12/12/1945", dtf);
        LocalDate finish = LocalDate.parse("12/12/2022", dtf);
    

        long dd = ChronoUnit.DAYS.between(start, finish);
        System.out.println("There are " + dd+" Days between the two dates.");
    }
    
}
