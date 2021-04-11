/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String entrada, saida;
        int numeroConta, saldo, totalItens, totalCreditos,
                limiteCredito, novoSaldo;
        entrada = JOptionPane.showInputDialog("Digite o numero da conta");
        numeroConta = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Digite o saldo");
        saldo = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Digite o total de itens");
        totalItens = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Digite o total de creditos");
        totalCreditos = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Digite o limite");
        limiteCredito = Integer.parseInt(entrada);
        novoSaldo = saldo + totalItens - totalCreditos;
        if (novoSaldo > limiteCredito) {
            JOptionPane.showMessageDialog(null, "O cliente da conta " + numeroConta + " excedeu o limite!");
        } else {
            JOptionPane.showMessageDialog(null, "O cliente da conta " + numeroConta + " NAO excedeu o limite!");
        }
    }
}
