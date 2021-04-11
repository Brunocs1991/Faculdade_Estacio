/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estacio.capitulo2.ex4;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author bruno
 */
public class Pais {

    private String descricao;
    private String capital;
    private String tamanho;
    private List<Pais> vizinhos;

    public Pais(String descricao, String capital, String tamanho) {
        super();
        this.descricao = descricao;
        this.capital = capital;
        this.tamanho = tamanho;
    }

    public Pais(String descricao, String capital, String tamanho, List<Pais> vizinhos) {
        this.descricao = descricao;
        this.capital = capital;
        this.tamanho = tamanho;
        this.vizinhos = vizinhos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public List<Pais> getVizinhos() {

        return vizinhos;
    }

    public void setVizinhos(List<Pais> vizinhos) {
        this.vizinhos = vizinhos;
    }

    @Override
    public String toString() {
        if (vizinhos == null) {
            return "Pais{" + "descricao=" + descricao + ", capital=" + capital + ", tamanho=" + tamanho + '}';
        } else {
            return "Pais{" + "descricao=" + descricao + ", capital=" + capital + ", tamanho=" + tamanho + '}'
                    + "\nvizinhos" + vizinhos.subList(0, vizinhos.size());
        }

    }
}
