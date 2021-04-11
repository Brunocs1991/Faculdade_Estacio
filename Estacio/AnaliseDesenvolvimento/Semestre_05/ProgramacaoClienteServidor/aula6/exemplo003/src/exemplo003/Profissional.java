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
public class Profissional extends Pessoa{
    public String profissao;

    @Override
    public void exibir() {
        super.exibir(); //To change body of generated methods, choose Tools | Templates.
        //chama o exibir de pessoa, imprimindo o nome e telefone
        System.out.println("\tTrabalha como "+ profissao);
        // Complementa a informação acerca da profissão
    }
    
}
