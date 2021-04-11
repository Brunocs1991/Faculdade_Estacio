
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brunocs
 */
public class Tela extends JFrame{

    private GridLayout layout = null;
    public Tela() {
    
        super("Tela GridLayout");
        setPreferredSize(new Dimension());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800,400));
        layout = new GridLayout(3,3);
        getContentPane().setLayout(layout);
        
        for (int i = 0; i < 20; i++) {
            add(new JButton("Botão - " + i));
        }
        pack();
    }
}
