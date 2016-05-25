/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;

/**
 *
 * @author Syncs
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        
        System.out.println("\n\n\nnomer 2");
        for (int i = 1; i < 10; i += 2) {
      for (int j = 0; j < 9 - i / 2; j++){
        System.out.print(" ");
                };

      for (int j = 0; j < i; j++){
        System.out.print("*");
      }

      System.out.print("\n");
    }

    for (int i = 7; i > 0; i -= 2) {
      for (int j = 0; j < 9 - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    }
    }
    
}
