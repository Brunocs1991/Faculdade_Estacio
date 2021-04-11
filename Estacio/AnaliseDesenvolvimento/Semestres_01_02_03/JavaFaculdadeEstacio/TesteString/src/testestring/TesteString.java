/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testestring;

/**
 *
 * @author bruno
 */
public class TesteString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palindromo = "A sacada da casa";
        int tam = palindromo.length();
        char[] vetorCaracTemp = new char[tam];
        char[] vetorChar = new char[tam];
// guardando a string original em um vetor de caracteres
        for (int i = 0; i < tam; i++) {
            vetorCaracTemp[i] = palindromo.charAt(i);
        }
// invertendo o vetor de caracteres
        for (int j = 0; j < tam; j++) {
            vetorChar[j] = vetorCaracTemp[tam - 1 - j];
        }
        String palindromoInvertido = new String(vetorChar);
        System.out.println(palindromoInvertido);
    }
}


