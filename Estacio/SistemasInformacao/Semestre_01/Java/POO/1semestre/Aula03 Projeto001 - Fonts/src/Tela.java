
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

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
    
    private JTextField txtNome = null;
    private JTextField txtEmail = null;
    private JButton btnEnviar = null;
    private Font font = null;

    public Tela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocation(new Point(500,400));
        
        txtNome = new JTextField("Bruno Costa e Silva ");
        txtEmail = new JTextField("brunocosta.1991@hotmail.com ");
        btnEnviar = new JButton("Enviar");
        
        txtNome.setFont(new Font("Serif", Font.BOLD, 16));
        font = txtNome.getFont();
        btnEnviar.setFont(font);
        
        add(txtNome);
        add(txtEmail);
        add(btnEnviar);
        pack();
    }
}
