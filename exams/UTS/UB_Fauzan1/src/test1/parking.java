/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Syncs
 */
public class parking {
    public double totalReceipts =0.0; 
    public double hours;
    public double fee; 
       public double calculateCharge(double hours){
      /*final*/ double minPark= 2.0; 
      /*final*/ double maxPark= 10.0; 
	  /*final*/ double maxHours= 24.0;
      /*final*/ double minHours= 3.0; 
      /*final*/ double hourEx= 0.5; 
      
	  
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
