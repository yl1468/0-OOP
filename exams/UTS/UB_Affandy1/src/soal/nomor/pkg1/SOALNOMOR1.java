/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.nomor.pkg1;

import java.util.Scanner;

/**
 *
 * @author DIMDIM
 */
public class SOALNOMOR1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in); 
        parking park=new parking();
      
      double bayaran; 
      double jam; 
      
      System.out.print( "Masukkan Total Masukan Kemarin : " );
      park.totalReceipts = input.nextDouble(); 
      System.out.println( " Masukan Hari ini " );
      System.out.print( "Masukkan Jumlah Jam : " );
      jam = input.nextDouble(); 
	  
      while (jam >= 0.0)
	  { 
         bayaran=park.calculateCharge(jam); 
         park.totalReceipts += bayaran; 
         System.out.printf( "Current charge: $%.2f, Total receipts: $%.2f\n",park.bayaran, park.totalReceipts );
		 System.out.print( "Enter number of hours (a negative to quit): " );
		 jam = input.nextDouble();
      } 
   } 
    }
    

