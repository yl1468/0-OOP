/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamonddisplay;

/**
 *
 * @author G400
 */
public class CreatingDiamond {
    
    
    public void firstTriangle(){
        int n = 7; 
        for(int i=1; i<=n; i++) {  
            for(int j=n; j>i; j--) { 
                System.out.print(" "); 
            } 
        for(int k=1; k<=i; k++) { 
            System.out.print("* "); 
        }
            System.out.println();
        }
        for(int i=1; i<=n; i++) {  
            for(int j=1; j<i; j++) { 
                System.out.print(" "); 
            } 
        for(int k=7; k>=i; k--) { 
            System.out.print("* "); 
        }
            System.out.println();
        }
        System.out.println();
        
        
    }
}

