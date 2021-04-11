/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo010;

/**
 *
 * @author bruno
 */
public class Exemplo010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciando e iniciando objeto
        Pessoa p1 = new Pessoa("João", "1111-1111");
        Pessoa p2 = new Pessoa("Maria", "2222-2222");
        
        // chamando metodo exibir;
        p1.exibir();
        p2.exibir();
        
        
    }
    
}
