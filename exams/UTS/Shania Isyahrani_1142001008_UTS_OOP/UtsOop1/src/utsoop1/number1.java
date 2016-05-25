/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsoop1;
import java.util.Scanner;
/**
 *
 * @author Shania
 */
public class number1 {
    private int charge;
    
    static double calculateCharges;
    
    public void setcharge(int cha){
        this.charge = cha;
    }
    
    public int getcharge(){
        return this.charge;
    }
    
     public static double calculateCharges (double numHour)
    {

        double garageCost = 0;

        if(numHour<=3)
            garageCost = 2;

        else if(numHour>3 && numHour<=23)
            garageCost = 2.0 + 0.5*(numHour - 3);

        else if (numHour >23)
            garageCost = 10;

        return garageCost;
    }

}

