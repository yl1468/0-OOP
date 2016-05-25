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
public class Uts1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double hours, biaya;
        
        Scanner keyboard = new Scanner (System.in);
      
        System.out.println("Enter the total parking hours: ");
        hours = keyboard.nextDouble();

        charges totalCharges = new charges();
        biaya = totalCharges.getcharges();
        
    }
    
}
