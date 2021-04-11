/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo009;

/**
 *
 * @author bruno
 */
public class Exemplo009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int intervalo = 10;

        for (int i = 0; i < intervalo; i++) {
            boolean ehPrimo = true;
            for (int j = 2; j <= i; j++) {
                if (((i % j) == 0) && (j != i)) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println(i + " é Primo!");
            } else {
                System.out.println(i + " não é Primo!");
            }
        }
    }
}
