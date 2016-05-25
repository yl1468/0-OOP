/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garageoutput;
import java.util.Scanner;
/**
 *
 * @author Person
 */
public class GarageOutput {   
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double totalReceipts =0.0;
        double fee;
        double hours;
        
        GarageInput kalkulasi = new GarageInput();
        
        System.out.print("Enter number of hours : ");
        hours = input.nextDouble();
    
        while (hours >= 0.0){
            fee = input.nextDouble();
            
        totalReceipts += fee;
        System.out.printf("Current charge: $%.2f, Total receipts: $%.2f\n",fee, totalReceipts);
        System.out.print("Enter number of hours : ");
        kalkulasi.calculateCharge(hours);
//         hours = input.nextDouble();
      } 
   } 
}

//    private static double calculateCharge(double hours){
//
//        double minParking= 2.0;
//        double maxParking= 10.0;
//        double maxHours= 24.0;
//        double minHours= 3.0;
//        double hourEx= 0.5;
//        double fee;
//        
//        fee= minParking;
//                
//        if (hours <= minHours)
//            fee = minParking;
//        
//        if (hours > minHours && hours < maxHours)
//            fee = hourEx * (Math.ceil(hours) - minHours) + minParking;
//
//        if (hours >= maxHours)
//            fee = maxParking;
//
//      return fee;
//
//   } 
//} 