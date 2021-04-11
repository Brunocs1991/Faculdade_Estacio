/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estacio.capitulo2.ex2;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class TesteClassePessoa {

    public static void main(String args[]) {
        Pessoa Objeto1 = new Pessoa();
        Pessoa Objeto2 = new Pessoa();
        Objeto1.setNome("Fabiano");
        Objeto1.setIdade(42);
        JOptionPane.showMessageDialog(null, "Antes do aniversário\n" + Objeto1.toString(), "Pessoa 1", JOptionPane.INFORMATION_MESSAGE);
        Objeto1.fazAniversario();
        JOptionPane.showMessageDialog(null, "Depois do aniversário\n" + Objeto1.toString(), "Pessoa 1", JOptionPane.INFORMATION_MESSAGE);
        Objeto2.setNome("Vinicius");
        Objeto2.setIdade(9);
        JOptionPane.showMessageDialog(null, "antes do aniversário\n" + Objeto2.toString(), "Pessoa 2", JOptionPane.PLAIN_MESSAGE);
        Objeto2.fazAniversario();
        JOptionPane.showMessageDialog(null, "Depois do aniversário\n" + Objeto2.toString(), "Pessoa 2", JOptionPane.PLAIN_MESSAGE);

    }

}
