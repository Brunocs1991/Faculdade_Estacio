/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estacio.capitulo1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class exercicio5 {

    public static void main(String args[]) {
        String s = JOptionPane.showInputDialog(null, "Entre com a palavra 1", "PRIMEIRA", JOptionPane.QUESTION_MESSAGE);
        String r = JOptionPane.showInputDialog(null, "Entre com a palavra 2", "SEGUNDA", JOptionPane.QUESTION_MESSAGE);
        char[] a = s.toCharArray();
        char[] b = r.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            JOptionPane.showMessageDialog(null, "E anagrama", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Não e anagrama", "FALHA", JOptionPane.WARNING_MESSAGE);
        }
    }

}
