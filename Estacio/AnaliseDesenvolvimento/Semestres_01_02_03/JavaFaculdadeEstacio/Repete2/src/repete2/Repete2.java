/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repete2;

/**
 *
 * @author bruno
 */
public class Repete2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int conta = 1;
        do {
            System.out.println("Contando: " + conta);
            conta = conta + 1;
        } while (conta < 11);
    }
}
