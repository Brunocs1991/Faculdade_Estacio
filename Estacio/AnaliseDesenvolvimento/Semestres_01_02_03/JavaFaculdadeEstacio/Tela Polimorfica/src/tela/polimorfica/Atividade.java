/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.polimorfica;

/**
 *
 * @author bruno
 */
public class Atividade {

    private int codAtv;
    private String descricao;

    public Atividade(int codAtv, String descricao) {
        this.codAtv = codAtv;
        this.descricao = descricao;
    }

    public int getCodAtv() {
        return codAtv;
    }

    public void setCodAtv(int codAtv) {
        this.codAtv = codAtv;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return "Atividade{" + "codAtv=" + codAtv + ", descricao=" + descricao
                + '}';
    }
}
