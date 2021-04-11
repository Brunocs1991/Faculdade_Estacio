/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estacio.capitulo2.ex2;

/**
 *
 * @author bruno
 */
public class Pessoa {

    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Exercicio2: [" + "idade=" + idade + ", nome=" + nome + ']';
    }

    public void fazAniversario() {
        this.idade++;
    }

}
