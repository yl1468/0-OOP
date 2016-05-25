/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2;

/**
 *
 * @author Putri Arta
 */
import java.util.Scanner;
public class Uts2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j, k, l;
        
//        Scanner input = new Scanner (System.in);
//        System.out.print("Masukkan simbol, angka, atau huruf: ");
//        int n = input.nextInt();
        
        
        for (i=1; i<=5; i++){
            for(j=4; j>=i; j--){
                System.out.print(" ");
            }
            for(k=1; k<=i; k++){ 
                System.out.print("*");
            }
            for (l=1; l<=i-1; l++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for (i=1; i<=5; i++){
            for (j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (k=9; k>=i; k--) { 
                System.out.print("*");
            }
            for (l=9; l<i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
            
  
 
