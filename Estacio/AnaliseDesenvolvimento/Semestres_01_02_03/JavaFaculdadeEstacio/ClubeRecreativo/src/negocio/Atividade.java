/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

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

    /**
     * @return the codAtv
     */
    public int getCodAtv() {
        return codAtv;
    }

    /**
     * @param codAtv the codAtv to set
     */
    public void setCodAtv(int codAtv) {
        this.codAtv = codAtv;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return "Atividade{" + "codAtv=" + codAtv + ", descricao=" + descricao
                + '}';
    }
}
