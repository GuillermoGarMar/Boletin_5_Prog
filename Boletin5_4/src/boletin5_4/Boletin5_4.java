/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p1, p2;
        p1 = 85;
        p2 = 90;

        if(p1 > p2){
           System.out.println("Manolo pesa: "+ p1 +"Kg"); 
           System.out.println("La diferencia es de: "+ (p1 - p2) +"Kg");
        }
        else{
            System.out.println("Jose pesa: "+ p2);
            System.out.println("La diferencia es de: "+ (p2 - p1) +"Kg");
        }
    }
    
}
