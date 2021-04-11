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
public class Morcego extends Mamifero implements Voo{

    public Morcego() {
        familia= "Phyllostomidae";
    }

    @Override
    public void mamar() {
        System.out.println("Morcego mamando...");
    }

    @Override
    public void voar() {
        System.out.println("Morcego voando...");
    }
    
}
