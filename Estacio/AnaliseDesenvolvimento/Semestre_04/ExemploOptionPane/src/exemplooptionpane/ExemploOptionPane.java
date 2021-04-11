/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplooptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class ExemploOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = new Integer(JOptionPane.showInputDialog("Primeiro Numero:"));
        int b = new Integer(JOptionPane.showInputDialog("Segundo Numero:"));
        int c = a + b;
        JOptionPane.showMessageDialog(null, "A soma será: "+c, "Soma",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
