package aula7button;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Aula7Button extends JFrame {

    private JLabel label1;
    private JButton botao1;

    public Aula7Button() {
        setTitle("Aula 7 Botão");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setLocationRelativeTo(null);

        label1 = new JLabel();
        label1.setText("Exemplo de Botão para encerrar a tela");
        label1.setBorder(BorderFactory.createTitledBorder(""));
        label1.setPreferredSize(new Dimension(245, 100));
        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        add(label1);

        botao1 = new JButton();
        botao1.setText("Sair");

        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        botao1.setHorizontalAlignment(SwingConstants.LEFT);
        botao1.setToolTipText("Fecha a aplicação");
        add(botao1);

    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                Aula7Button janela = new Aula7Button();
                janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
                janela.setVisible(true);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }

}
