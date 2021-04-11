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
        // instanciando pessoas
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        // preenchimento dos atrubutos
        p1.setNome("João");
        p1.setTelefone("1111-1111");
        p2.setNome("Maria");
        p2.setTelefone("2222-2222");
        
        // chamada do metodo exibir
        p1.exibir();
        p2.exibir();
        
    }
    
}
