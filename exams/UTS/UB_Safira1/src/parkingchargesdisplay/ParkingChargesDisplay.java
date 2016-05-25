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
public class ParkingChargesDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double durasiParkir;
        double tarifParkir;
        CountParkingCharges parkir = new CountParkingCharges(); 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan durasi lama parkir : ");
        durasiParkir = input.nextDouble();
        parkir.setParkDuration(durasiParkir);
        tarifParkir = parkir.countCharges(durasiParkir);
        
        
        
        System.out.println();
        System.out.println("Lama durasi parkir : " + parkir.getParkDuration());
        System.out.println("Biaya parkir adalah sebesar $" + tarifParkir);
        
        
        
        
    }
    
}
