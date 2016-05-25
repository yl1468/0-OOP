/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_nmr_2;

/**
 *
 * @author Luci
 */
public class loop {
    public loop(){
    }
    
    public void for5(){
        int b = 1;
        for(int i = 1; i<=5; i++){
            for (int k = 5; k>i;k--){
                System.out.print(" ");
            }
            for(int j = 0;j<b; j++){
                System.out.print("*");
            }
            System.out.println();
        b +=2;
        }
        b -=4;
        for(int i = 0 ; i < 4; i++){
            for(int k = 0; k<=i;k++){
                System.out.print(" ");
            }
            for (int j = 0; j<b;j ++){
                System.out.print("*");
            }
            System.out.println();
        b -=2;
        }
    }
}
