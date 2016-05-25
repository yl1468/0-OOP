/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsoop1;
import java.util.Scanner;
import static utsoop1.number1.calculateCharges;
/**
 *
 * @author Shania
 */
public class UtsOop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       double valHour;
       
       Scanner parkCharge = new Scanner(System.in);
       number1 valHour = new number1();

        System.out.print("-- GARAGE PARKING --" + "\n\n");
       
        System.out.print("Enter number of Cars parked yesterday: ");
        final int carNum = parkCharge.nextInt();

        double hoursPark=0;
        double currentCost=0;   
        double totalCost=0;

        for(int count = 1; count<=carNum; count++)
        {   
            System.out.print("Enter parking hours for " + count + ": ");
            hoursPark = parkCharge.nextDouble();
            currentCost = calculateCharges(hoursPark); //total customer yang baru
            totalCost+=currentCost; //total semuanya
        }

        System.out.println("Most recent customer Paid: "   +  valHour.currentCost());
        System.out.println("Running total of receipts: " + valHour.totalCost());

    }

}
    

