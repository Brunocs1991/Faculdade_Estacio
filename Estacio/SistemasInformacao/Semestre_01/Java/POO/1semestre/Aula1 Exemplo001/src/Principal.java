
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame formulario = new JFrame();
        JLabel rotulo = new JLabel("Exemplo de Label");
        
        formulario.setSize(400,200);
        formulario.setTitle("Exemplo Tela");
        formulario.setLocation(100,100);
        
        formulario.add(rotulo);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
