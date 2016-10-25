/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;
import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short n1 = Short.parseShort(JOptionPane.showInputDialog("Introduce un numero"));
        short n2 = Short.parseShort(JOptionPane.showInputDialog("Introduce un numero"));
        if (n1>=n2){
            System.out.println(n1-n2);
            System.out.println(n1+n2);
        }else{
            System.out.println(n1+n2);
        }
    }
    
}
