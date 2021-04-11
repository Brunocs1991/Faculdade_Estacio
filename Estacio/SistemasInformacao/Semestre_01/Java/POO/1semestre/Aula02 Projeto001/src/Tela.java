
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Tela extends JFrame{
    
    private FlowLayout layout = null;
    
    public Tela(){
        super("Teste FlowLayout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400,200));
        layout = new FlowLayout();
        setLayout(layout);
        layout.setAlignment(FlowLayout.CENTER);
        
        add(new JButton("Botao - 0"));
        add(new JButton("Botao - 1"));
        add(new JButton("Botao - 2"));
        add(new JButton("Botao - 3"));
        add(new JButton("Botao - 4"));
        pack();
    }
}
