/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1;

/**
 *
 * @author Rahman
 */

public class parking {
    public parking(){}
    public double totalReceipts =0.0; 
    public double hours;
    public double fee; 
    public double calculateCharges (double hours) {
       
      double minPark= 2.0; 
      double maxPark= 10.0; 
      double maxHours= 24.0;
      double minHours= 3.0; 
      double hourEx= 0.5; 
      
	  
      fee= minPark; 
	  
	  if ( hours <= minHours )
	     fee = minPark;
		 
	  if ( hours > minHours && hours < maxHours )
	     fee = (hourEx*(Math.ceil(hours) - minHours)) + minPark;
		 
	  if (hours >= maxHours)
	     fee = maxPark;

      return fee; 
    }
}

