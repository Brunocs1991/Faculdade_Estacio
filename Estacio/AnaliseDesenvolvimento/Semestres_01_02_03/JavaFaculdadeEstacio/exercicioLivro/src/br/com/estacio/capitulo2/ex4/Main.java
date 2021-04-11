/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estacio.capitulo2.ex4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Main {

    public static void main(String args[]) {
        Pais uruguai = new Pais("Uruguai", "Monte", "pequeno");
        Pais argentina = new Pais("Argentina", "Buenos", "médio");
        ArrayList<Pais> vizinhos = new ArrayList<>();
        vizinhos.add(argentina);
        vizinhos.add(uruguai);
        Pais brasil = new Pais("Brasil", "Brasilia", "Grande", vizinhos);
        int escolha;
        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "\t\tDIGITE\n"
                    + "\n1 para Uruguai"
                    + "\n2 para Brasil"
                    + "\n3 para Argentina\n\n",
                    "Paises", JOptionPane.PLAIN_MESSAGE));
            switch (escolha) {
                case 1:
                    JOptionPane.showMessageDialog(null, uruguai.toString(), "Uruguai", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, brasil.toString(), "Brasil", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, argentina.toString(), "Argentina", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Fechando Programa", "EXIT", JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (escolha != 0);

    }

}
