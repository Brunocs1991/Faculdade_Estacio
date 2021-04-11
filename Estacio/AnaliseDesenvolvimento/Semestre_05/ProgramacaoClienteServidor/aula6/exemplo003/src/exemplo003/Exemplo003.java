/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo003;

/**
 *
 * @author brunocs
 */
public class Exemplo003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciando objeto p1 e p2
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        // Preenchimento dos atributos dos objetos p1 e p2
        p1.nome = "João";
        p1.telefone = "1111-1111";
        p2.nome = "Maria";
        p2.telefone = "2222-2222";
        //chamada do método exibir em p1 e p2
        p1.exibir();
        p2.exibir();
    }
    
}
