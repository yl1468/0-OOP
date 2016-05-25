/**
 * Note: output lebih dari $10
 */
package uts1;

/**
 *
 * @author Rahman
 */
import java.util.Scanner;
public class UTS1 {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in); 
    parking park1 =new parking();
      
      double fee; 
      double hours; 
      
      System.out.print( "Enter Total yesterday's receipt : " );
      park1.totalReceipts = input.nextDouble(); 
      System.out.println( "-- Today Receipt --" );
      System.out.print( "Enter number of hours : " );
      hours = input.nextDouble(); 
	  
      while (hours >= 0.0)
	  { 
         fee=park1.calculateCharges(hours); 
         park1.totalReceipts += fee; 
         System.out.printf( "Current charge: $%.2f, Total receipts: $%.2f\n",park1.fee, park1.totalReceipts );
		 System.out.print( "Enter number of hours (a negative to quit): " );
		 hours = input.nextDouble();
      }
    }
}
