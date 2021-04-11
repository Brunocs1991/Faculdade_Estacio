package principal;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ClienteFrame extends JFrame {

    private JLabel labNome = new JLabel("Nome : ");
    private JLabel labNumConta = new JLabel("Num. Conta : ");
    private JTextField txtNome = new JTextField(20);
    private JTextField txtNumConta = new JTextField(10);
    private JButton botOk = new JButton("Criar Objeto");

    public ClienteFrame() {
        super("Criar Cadastro");
        setLayout(new FlowLayout());
        add(labNome);
        add(txtNome);
        add(labNumConta);
        add(txtNumConta);
        add(botOk);

        TrataBotao tratamento = new TrataBotao();
        botOk.addActionListener(tratamento);
    }

    private class TrataBotao implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Cliente novo;
            String saida;
            String nome = txtNome.getText();
            int numConta = Integer.parseInt(txtNumConta.getText());
            novo = new Cliente(nome, numConta);
            JOptionPane.showMessageDialog(null, novo, "Mensagem", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
