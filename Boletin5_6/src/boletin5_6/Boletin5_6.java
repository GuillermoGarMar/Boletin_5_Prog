/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_6;
    import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int np = Integer.parseInt(JOptionPane.showInputDialog("introduce el valor del producto"));
        if (np <= 100){
            System.out.println("baixo");
        }else if (np>100 && np<= 500){
            System.out.println("medio");
        }else if ( np>500 && np <= 1000){
            System.out.println("alto");
        }else if (np > 1000){
            System.out.println("primeira necesidade");
        }
    }
    
}
