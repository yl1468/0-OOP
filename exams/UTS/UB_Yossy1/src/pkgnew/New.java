/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

/**
 *
 * @author Ochy
 */
import java.util.Scanner;
public class New {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
//        DecimalFormat formatter = new DecimalFormat("$##.00");

        System.out.print("Enter the number of cars parked yesterday: ");
        final int NUMBER_OF_CARS = keyboard.nextInt();

        double hoursParked=0;
        double currentCost=0;   
        double totalCost=0;

        for(int count = 1; count<=NUMBER_OF_CARS; count++)
        {   
            System.out.print("Enter hours parked for car " + count + ": ");
            hoursParked = keyboard.nextDouble();
            calculateCharges object = new calculateCharges ();
            currentCost = object.calculateCharges(hoursParked); //most recent customer
            totalCost+=currentCost; //Running total
        }

        System.out.println("Most recent customer paid: "   +  (currentCost));
        System.out.println("Running total of receipts: " + (totalCost));
    }
    
}
