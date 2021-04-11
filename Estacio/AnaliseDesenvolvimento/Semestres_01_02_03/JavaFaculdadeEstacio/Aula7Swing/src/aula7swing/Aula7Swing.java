
package aula7swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Aula7Swing extends JFrame{
    
    public Aula7Swing(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel teste = new JLabel("Exemplo de label", SwingConstants.CENTER);
        teste.setBorder(BorderFactory.createTitledBorder(""));
        teste.setPreferredSize(new Dimension(200, 150));
        add (teste);
    }
      

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Aula7Swing temp = new Aula7Swing();
                temp.setVisible(true);
            }
        });

    }
    
}
