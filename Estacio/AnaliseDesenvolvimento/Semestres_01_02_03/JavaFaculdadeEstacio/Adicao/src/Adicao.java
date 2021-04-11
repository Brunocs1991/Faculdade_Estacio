
import javax.swing.JOptionPane;

public class Adicao {

    public static void main(String[] args) {
        String num1, num2;
        int n1, n2, soma;
        num1 = JOptionPane.showInputDialog(null, "Digite o primeiro Número", "Entrada", 3);
        n1 = Integer.parseInt(num1);
        num2 = JOptionPane.showInputDialog(null, "Digite o segundo Número", "Entrada", 3);
        n2 = Integer.parseInt(num2);
        soma = n1 + n2;
        JOptionPane.showMessageDialog(null, "A soma e: " + soma,"Mensagem",1);
    }
}
