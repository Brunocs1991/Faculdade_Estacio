package swing1;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Swing1 extends JFrame {

    public Swing1() {
        setTitle("Primeiro Exemplo");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Swing1 ex = new Swing1();
                ex.setVisible(true);
            }
        });
    }

}
