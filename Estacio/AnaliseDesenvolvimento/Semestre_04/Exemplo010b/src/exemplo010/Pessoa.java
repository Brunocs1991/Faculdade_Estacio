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
public class Pessoa {
    String nome;
    String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome =  nome;
        this.telefone = telefone;
    }
    void exibir(){
        System.out.println(nome+"::"+telefone);
    }
}

