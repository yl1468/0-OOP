/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garageoutput;

/**
 *
 * @author Person
 */
public class GarageInput {
//    double totalReceipts =0.0;
//    double fee;
//    double hours;
    
    public void calculateCharge(double hours){
        double minParking= 2.00;
        double maxParking= 10.0;
        double maxHours= 24.0;
        double minHours= 3.0;
        double hourEx= 0.50;
        double fee;
        
        fee= minParking;
                
        if (hours <= minHours)
            fee = minParking;
        
        if (hours > minHours && hours < maxHours)
            fee = hourEx * (Math.ceil(hours) - minHours) + minParking;

        if (hours >= maxHours)
            fee = maxParking;

//      return fee;
    }
}
