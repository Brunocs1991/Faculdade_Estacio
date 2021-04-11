/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enhancedfor;

/**
 *
 * @author bruno
 */
public class EnhancedFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarando um vetor inteiro contendo uma lista de números
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//o for abaixo percorre o vetor e mostra na tela cada um dos números
        for (int item : numeros) {
            System.out.println("Contando: " + item);
        }

    }
}
