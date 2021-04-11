/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiaparte;

/**
 *
 * @author bruno
 */
public class CopiaParte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //(1) cria o array "a" e o preenche com os caracteres da palavra "telefone"
        char[] a = {'t', 'e', 'l', 'e', 'f', 'o', 'n', 'e'};
        //(2) Copia apenas a parte "ele" para o array b, usando “System.arraycopy()”
        char[] b = new char[3];
        //primeiro é preciso reservar espaço para b
        System.arraycopy(a, 1, b, 0, 3);
        //agora copiamos a palavra "ele"
        //(3) exibe o conteúdo de "b"    
        System.out.println("array original");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
        System.out.println("array apos copia");

        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]= " + b[i]);
        }

    }
}
