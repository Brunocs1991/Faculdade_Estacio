
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

    public Tela() {
        super("Exemplo fonts 3");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(500,400);
        
        String listaDeFontes[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        int i = listaDeFontes.length;
        
        getContentPane().setLayout(new FlowLayout());
        JLabel jb;
        Font f;
        
        for (int j = 0; j < i; j++) {
            jb = new JLabel("Aula 3 -" + listaDeFontes[j] + "- xx");
            f = new Font(listaDeFontes[j], Font.PLAIN, 14);
            jb.setFont(f);
            add(jb);
        }
        pack();
    }
}
