/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1;

/**
 *
 * @author Putri Arta
 */
import java.util.Scanner;
public class charges {
    double hours;
    double biaya;
    double a = 2.00;
    double b=0.50;
    
    public double gethours(){
        Scanner keyboard = new Scanner (System.in);
        hours = keyboard.nextDouble();
        return hours;
    }
    public double getcharges(){
        if (hours <= 3){
            biaya = a;
            System.out.println("Your parking charges is $" + a);
            return 0;
        }
       
     
        if (hours < 24){
//            biaya = (hours*b);
            System.out.println("Your parking charges is $" + (hours*b));
        
            return 0;
        }
        return 0;
                  
    }
   
}


    

