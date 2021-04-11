import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Tela extends JFrame{

    public Tela(){
        super("Testte FlowLayout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 200));
        getContentPane().setLayout(new FlowLayout());
        
        for (int i = 0; i < 10; i++) {
            add(new JButton("Botao - " + i  ));
        }
        pack();
    }    
}
