/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfor;

/**
 *
 * @author bruno
 */
public class Arrayfor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarando um vetor de inteiros
        int[] umVetor;
// definindo o tamanho do vetor para 10 inteiros
        umVetor = new int[10];
// definindo o primeiro elemento
        umVetor[0] = 100;
// definindo o segundo elemento
        umVetor[1] = 200;
// e assim por diante
        umVetor[2] = 300;
        umVetor[3] = 400;
        umVetor[4] = 500;
        umVetor[5] = 600;
        umVetor[6] = 700;
        umVetor[7] = 800;
        umVetor[8] = 900;
        umVetor[9] = 1000;

        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento com índice " + i + ": " + umVetor[i]);
        }
    }

}
