/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo11;

/**
 *
 * @author bruno
 */
public class Gato extends Mamifero{

    public Gato() {
        familia="Felidae";
    }

    @Override
    public void mamar() {
        System.out.println("Gato mamando ...");
    }
    
}
