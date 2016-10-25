/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_5;

/**
 *
 * @author ggarciamartinez
 */
public class Boletin5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,z;
        x = 23;
        y = 50;
        z=29;
         if (x>y&&x>z) 
           System.out.println("O número "+x+" é maior");
        else if (y>x&&y>z)
            System.out.println("O número "+y+" é maior");
        else if (z>y&&z>x) System.out.println("O número "+z+" é maior");
        else System.out.println("Os tres números son iguais");
    }
    
}
