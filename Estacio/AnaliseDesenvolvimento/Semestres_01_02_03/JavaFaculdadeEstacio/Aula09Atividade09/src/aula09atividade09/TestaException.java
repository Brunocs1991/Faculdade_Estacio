/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09atividade09;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class TestaException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        try {
            int numero = entrada.nextInt();
            System.out.println("Voce digitou: " + numero);

        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Errou... ");
        }

    }
}
