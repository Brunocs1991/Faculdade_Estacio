/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhajanela;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bruno
 */
public class MinhaJanela extends JFrame{

    public MinhaJanela() throws HeadlessException {
       super("Apenas um teste");
        setLayout(new BorderLayout());
        setBounds(10, 10, 300, 200);
        JPanel jp = new JPanel(new FlowLayout());
        jp.add(new Button("ok"));
        jp.add(new Button("cancela"));
        add(jp,"South");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new MinhaJanela().setVisible(true);
    }
    
}
