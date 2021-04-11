package automovel;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        Automovel gol = new Automovel("Gol", "Branco", 2014, false);
        JOptionPane.showMessageDialog(null, gol);
        gol.ligarMotor();
        JOptionPane.showMessageDialog(null, gol);
        gol.setCor("Branco com faixa preta");
        JOptionPane.showMessageDialog(null, gol);
        JOptionPane.showMessageDialog(null, gol, "Mensagem", 1); // altetando o titulo e definindo como alerta na caixa de mensagem
    }
}
