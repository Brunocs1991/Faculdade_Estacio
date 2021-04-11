
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
    
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    
    private JPanel painel;

    public Tela() {
        setLayout(new BorderLayout());
        painel = new JPanel();
        painel.setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(200, 200, 600, 300);
        
        botao1 = new JButton("Botão 1");
        botao2 = new JButton("Botão 2");
        botao3 = new JButton("Botão 3");
        botao4 = new JButton("Botão 4");
        botao5 = new JButton("Botão 5");
        botao6 = new JButton("Botão 6");
        
        add(botao1, BorderLayout.CENTER);
        painel.add(botao2);
        painel.add(botao3);
        painel.add(botao4);
        painel.add(botao5);
        painel.add(botao6);
        add(painel, BorderLayout.SOUTH);
    }    
}
