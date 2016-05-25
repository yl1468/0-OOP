/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingchargesdisplay;

/**
 *
 * @author G400
 */
import java.util.Scanner;
public class CountParkingCharges {
    Scanner ketik = new Scanner(System.in);
    private double parkDuration, parkCharges;
    
     CountParkingCharges(){
         
     }
     
     CountParkingCharges(double duration){
         
     }
     
     public void setParkDuration(double duration){
         parkDuration = duration;
     }
     
     public double getParkDuration(){
         return parkDuration;
     }
     public double countCharges(double parkDuration){
         parkCharges = parkDuration * 0.50;
         
         if (parkDuration > 24.0){
            parkCharges = 10.0;
        }else if(parkDuration < 3.0){
            parkCharges = 2.0;
        }
        
         return parkCharges;
     }     
}
