package principal;

import principal.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ClienteFrameOuro extends JFrame {

    private JLabel labNome = new JLabel("Nome: ");
    private JTextField txtNome = new JTextField(20);
    private JLabel labNumConta = new JLabel("Num. Conta: ");
    private JTextField txtNumConta = new JTextField(10);
    private JLabel labLimite = new JLabel("Limite: ");
    private JTextField txtLimite = new JTextField(10);
    private JButton botok = new JButton("Criar Objeto");

    public ClienteFrameOuro() {
        super("Cadastro do Cliente Ouro ");
        setLayout(new FlowLayout());
        add(labNome);
        add(txtNome);
        add(labNumConta);
        add(txtNumConta);
        add(labLimite);
        add(txtLimite);
        add(botok);

        TrataBotao tratamento = new TrataBotao();
        botok.addActionListener(tratamento);

    }

    private class TrataBotao implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ClienteOuro novo;
            String nome = txtNome.getText();
            int numConta = Integer.parseInt(txtNumConta.getText());
            double limite = Double.parseDouble(txtLimite.getText());

            novo = new ClienteOuro(nome, numConta, limite);

            JOptionPane.showMessageDialog(null, novo, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
