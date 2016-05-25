/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamondoutput;

/**
 *
 * @author Person
 */
public class DiamondInput {
    
    public void segitigaAtas(){
        for (int a=1; a<10; a+=2) {
            for (int b=0; b<9-a/2; b++)
                System.out.print(" ");
            
            for (int b=0; b<a; b++)
                System.out.print("*");
            
            System.out.print("\n");
        }
    }
    
    public void segitigaBawah(){
        for (int a=7; a>0; a-=2) {
            for (int b=0; b<9-a/2; b++)
                System.out.print(" ");
            
            for (int b=0; b<a; b++)
                System.out.print("*");
            
            System.out.print("\n");
    }
  }
}
