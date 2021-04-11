package principal;

import javax.swing.JFrame;

public class Teste {

    public static void main(String[] args) {
        ClienteFrameOuro janela = new ClienteFrameOuro();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(675, 180);
        janela.setVisible(true);
    }

}
