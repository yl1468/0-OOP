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
import java.util.Scanner;
public class UTS_nmr_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ans;
        double an;
        int a;
        calculateCharges cal = new calculateCharges();
        System.out.print("How Many Customer parked yesterday : ");
        Scanner key = new Scanner(System.in);
        ans = key.nextLine();
        a = Integer.valueOf(ans);
        double[] inHour = new double[a];
        double[] pay = new double[a];
        double total = 0;
        for(int i = 0; i< a; i++){
            System.out.print("How long customer " + (i+1) + " parked ? : ");
            ans = key.nextLine();
            an = Double.valueOf(ans);
            inHour[i] = an;
            pay[i]=cal.check(inHour[i]);
            System.out.println("Customer " + i+1 +" Must Pay : $" + pay[i]);
            total = cal.Total(total , pay[i]);
        }
        System.out.println();
        System.out.println("Jumlah Receipts kemaren : " + a);
        System.out.println("Total uang parkir kemaren : $" + total );
        
        
        
        // TODO code application logic here
    }
    
}
