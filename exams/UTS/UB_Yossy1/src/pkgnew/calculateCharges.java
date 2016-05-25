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
public class calculateCharges {
    public static double calculateCharges(double numHours) {
    double garageCost = 0;

        if(numHours<=3)
            garageCost = 2;

        else if(numHours>3 && numHours<=19)
            garageCost = 2.0 + 0.5*(numHours - 3);

        else if (numHours >19)
            garageCost = 10;

        return garageCost;
    }
    
}

