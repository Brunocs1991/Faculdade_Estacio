
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
@SuppressWarnings("serial")
public class Tela extends JFrame{
    private JLabel rotulo = null;
    public Tela(){
        rotulo = new JLabel("Exemplo De Label");
        setSize(350,125);
        setTitle("Exemplo de Tela");
        setLocation(10,10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(rotulo);        
    }
}
