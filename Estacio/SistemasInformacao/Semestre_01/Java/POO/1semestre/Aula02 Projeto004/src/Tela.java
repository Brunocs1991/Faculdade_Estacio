
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
    
    private BorderLayout layout = null;

    public Tela() {
        super("Teste BorderLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 200));
        
        layout = new BorderLayout();
        setLayout(layout);
        
        layout.setHgap(5);
        layout.setVgap(5);
        
        add(new JButton("Norte"), BorderLayout.NORTH);
        add(new JButton("Sul"), BorderLayout.SOUTH);
        add(new JButton("Leste"), BorderLayout.EAST);
        add(new JButton("Oeste"), BorderLayout.WEST);
        add(new JLabel("Um texto no Centro"), BorderLayout.CENTER);
        pack();
    }    
}
