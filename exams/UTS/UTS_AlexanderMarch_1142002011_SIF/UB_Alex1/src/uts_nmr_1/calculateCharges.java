/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_nmr_1;

/**
 *
 * @author Luci
 */
public class calculateCharges {
    private double check;
 
    public calculateCharges(){

}
    public double check(double n1){
        double b;
        if(n1 <= 3){
            b = 2;
        }else if(n1>= 24){
            b = 10;
        }else{
            b = 0.5;
            return b + check(n1-1);
        }
        return b;
    }
    public double Total(double t,double pay){
        return t+pay;
    }
}


