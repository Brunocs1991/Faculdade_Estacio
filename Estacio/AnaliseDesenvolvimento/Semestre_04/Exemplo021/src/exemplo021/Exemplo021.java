/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo021;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Exemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Primeiro");
        lista.add("Segundo");
        lista.add("Terceiro");
        lista.forEach((x) -> {
            System.out.println(x);
        });
    }
    
}
