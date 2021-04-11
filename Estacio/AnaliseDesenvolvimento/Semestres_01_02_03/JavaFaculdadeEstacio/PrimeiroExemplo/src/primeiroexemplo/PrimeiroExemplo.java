package primeiroexemplo;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PrimeiroExemplo extends JFrame {
    
    public PrimeiroExemplo() {
        // ***depois vamos inserir um botão aqui***
        JButton botaoSair = new JButton(" Sair ");
        botaoSair.setToolTipText(" Clique-me ");
        setLayout(new FlowLayout());
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(botaoSair);
        // nas linhas abaixo configuramos a janela
        setTitle("Exemplos Simples");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        /* aqui nós criamos uma instância da classe PrimeiroExemplo e a mostramos na tela.
        * O método invokeLater() coloca o programa na Swing Event Queue – Fila de eventos
        * do Swing. Ele é usado (e recomendado) para garantir que todas as atualizações que
        * são feitas na interface sejam protegidas contra concorrência, ou seja, em outras
        * palavras, o método é usado para evitar que o programe “trave” em alguma situações.
         */
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PrimeiroExemplo ex = new PrimeiroExemplo();
                ex.setVisible(true);
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
    }
    
}
