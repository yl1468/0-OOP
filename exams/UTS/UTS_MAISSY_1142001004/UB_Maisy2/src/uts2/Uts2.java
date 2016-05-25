/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2;

/**
 *
 * @author USER
 */
public class Uts2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int m= 1; m< 10; m += 2) {
            
            for (int c= 0; c< 9 - m/ 2; c++)
                System.out.print(" ");

         for (int c= 0; c< m; c++)
            System.out.print("*");

        System.out.print("\n");
        }
        
        for (int m= 7; m> 0; m -= 2) {
             for (int c= 0; c< 9- m/ 2; c++)
                 System.out.print(" ");

      for (int c= 0; c< m; c++)
        System.out.print("*");

      System.out.print("\n");
        }
    }
}