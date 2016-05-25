/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamondshape1;

/**
 *
 * @author Ochy
 */
public class DiamondShape1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int o = 1; o < 10; o += 2) {
          for (int c = 0; c < 10 - o / 2; c++)
            System.out.print(" ");

          for (int c = 0; c < o; c++)
            System.out.print("*");

          System.out.print("\n");
        }

        for (int o = 7; o > 0; o -= 2) {
          for (int c = 0; c < 10 - o / 2; c++)
            System.out.print(" ");

          for (int c = 0; c < o; c++)
            System.out.print("*");

          System.out.print("\n");
        }
   
      }
    }
    
