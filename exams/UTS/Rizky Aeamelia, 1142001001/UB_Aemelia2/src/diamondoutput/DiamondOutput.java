/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamondoutput;
import java.util.Scanner;


/**
 *
 * @author Person
 */
public class DiamondOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
//        Scanner input = new Scanner(System.in);
        DiamondInput output = new DiamondInput();
        
        output.segitigaAtas();
        output.segitigaBawah();
    }
}

