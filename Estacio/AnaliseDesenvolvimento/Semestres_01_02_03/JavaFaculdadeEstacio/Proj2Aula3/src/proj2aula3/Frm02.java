package proj2aula3;

import javax.swing.*;

public class Frm02 {

    public void criaTela() {
//criando o Frame
        JFrame f = new JFrame();
        f.setSize(300, 100);
        f.setTitle("Cadastro de Categorias");
        f.setLocation(150, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//criando o Painel
        JPanel pl = new JPanel();
        pl.setLayout(null);// gerenciador de Layout
//Criando os componentes:
//Label
        JLabel meuLabel = new JLabel("Código");
        meuLabel.setBounds(10, 10, 60, 20);
// Campo de Texto
        JTextField meuCampoTexto = new JTextField(" ");
        meuCampoTexto.setBounds(80, 10, 60, 20);
// Botão
        JButton meuBotao = new JButton("NomeBotão");
        meuBotao.setBounds(150, 10, 100, 20);
//colando os componentes no Painel
        pl.add(meuLabel);
        pl.add(meuCampoTexto);
        pl.add(meuBotao);
//colando o painel no frame
        f.add(pl);
        f.setVisible(true);
    }
}
