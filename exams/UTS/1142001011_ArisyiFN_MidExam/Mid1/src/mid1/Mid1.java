/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mid1;
import java.util.Scanner;
/**
 *
 * @author Bagus Aryo
 */
public class Mid1 {
//    static double i;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
         System.out.println ("The Hours of Customers Parked: $" + calculate(20.00));
        
    }
    public static double calculate (double hours){
       
        Scanner input = new Scanner(System.in);
         System.out.print("Enter the Hours Parked: ");
         double L = input.nextDouble();
         
        double charge = 0;
        if( L <= 3) {
             charge = 2.0 ;
        }   else if (L < 20) {
                charge = 2.0 + 0.5 *(L - 3);
          }   else  {
                charge = 10.00;
          }
        
            return charge;
    }
}
