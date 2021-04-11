/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo007;

/**
 *
 * @author bruno
 */
public class Exemplo007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] x1 = {21, 32, 15, 27, 33, 17};
        int posicao = 0;
        int soma = 0;
        while(posicao< x1.length){ 
          // Enquanto for menor que o tamanho do vetor
            soma += x1[posicao];
            posicao++;
        }
        System.out.println(soma);
    }
    
}
