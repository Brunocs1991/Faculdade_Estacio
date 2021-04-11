/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estacio.capitulo1;
import java.awt.TrayIcon;
import javax.swing.JOptionPane;
/**
 * @author bruno
 */
public class exercicio1 {
    public static void main(String args[]) {
        String entrada, saida;
        int numeroConta, saldo, totalItens, totalCredito, limiteCredito, novoSalso;
        entrada = JOptionPane.showInputDialog(null, "Digite o numero da conta ", "CONTA",JOptionPane.QUESTION_MESSAGE);
        numeroConta = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog(null, "Digite o saldo", "SALDO",JOptionPane.QUESTION_MESSAGE);
        saldo = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog(null, "Digite o total de Itens", "ITENS", JOptionPane.QUESTION_MESSAGE);
        totalItens = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog(null, "Digite o total de creditos", "CREDITOS", JOptionPane.QUESTION_MESSAGE);
        totalCredito = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog(null,"Digite o limite de Credito", "LIMITE" , JOptionPane.QUESTION_MESSAGE);
        limiteCredito = Integer.parseInt(entrada);
        novoSalso = saldo + totalItens - totalCredito;
        if (novoSalso > limiteCredito) {
            JOptionPane.showMessageDialog(null, "O Cliente da conta " + numeroConta + " excedeu o limite!", "PASSOU DO LIMITE", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "O cliente da conta " + numeroConta + " NÃO excedeu o limite!" , "DENTRO DO LIMITE" ,JOptionPane.INFORMATION_MESSAGE );
        }
    }
}
