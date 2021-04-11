/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo023;

/**
 *
 * @author bruno
 */
public class Pessoa {
    public String nome;
    public String telefone;
    
    public void exibir(int quantidade){
        for (int i=0; i<quantidade; i++){
            System.out.println(nome+"::"+ telefone);
        }
    }
        
    
}
