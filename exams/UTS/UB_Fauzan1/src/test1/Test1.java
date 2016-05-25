/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Syncs
 */
import java.util.Scanner;
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code applicatioasdsadn logic here
    Scanner input = new Scanner(System.in); 
    parking park=new parking();
      
      double fee; 
      double hours; 
      
      System.out.print( "Enter Total yesterday's receipt : " );
      park.totalReceipts = input.nextDouble(); 
      System.out.println( "-- Today Receipt --" );
      System.out.print( "Enter number of hours : " );
      hours = input.nextDouble(); 
	  
      while (hours >= 0.0)
	  { 
         fee=park.calculateCharge(hours); 
         park.totalReceipts += fee; 
         System.out.printf( "Current charge: $%.2f, Total receipts: $%.2f\n",park.fee, park.totalReceipts );
		 System.out.print( "Enter number of hours (a negative to quit): " );
		 hours = input.nextDouble();
      } //end while 
   } // method main
   
   

    }
    
