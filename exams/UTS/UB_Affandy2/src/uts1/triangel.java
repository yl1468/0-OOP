/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1;

/**
 *
 * @author DIMDIM
 */
public class triangel {
    
    public void diamond(){
      for (int a = 1; a < 10; a += 2) {
      for (int j = 0; j < 9 - a / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < a; j++)
        System.out.print("*");

      System.out.print("\n");
    }

    for (int a = 7; a > 0; a -= 2) {
      for (int j = 0; j < 9 - a / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < a; j++)
        System.out.print("*");

      System.out.print("\n");
     }
   }
}

