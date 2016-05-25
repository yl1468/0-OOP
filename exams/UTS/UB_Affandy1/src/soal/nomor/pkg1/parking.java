/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.nomor.pkg1;

/**
 *
 * @author DIMDIM
 */
public class parking {
     public double totalReceipts =0.0; 
    public double jam;
    public double bayaran; 
       public double calculateCharge(double jam){
      /*final*/ double minPark= 2.0; 
      /*final*/ double maxPark= 10.0; 
	  /*final*/ double maxJam= 24.0;
      /*final*/ double minJam= 3.0; 
      /*final*/ double jamEx= 0.5; 
      
	  
      bayaran= minPark; 
	  
	  if ( jam <= minJam )
	     bayaran = minPark;
		 
	  if ( jam > minJam && jam < maxJam )
	     bayaran = (jamEx*(Math.ceil(jam) - minJam)) + minPark;
		 
	  if (jam >= maxJam)
	    bayaran = maxPark;

      return bayaran; 
   }
}
