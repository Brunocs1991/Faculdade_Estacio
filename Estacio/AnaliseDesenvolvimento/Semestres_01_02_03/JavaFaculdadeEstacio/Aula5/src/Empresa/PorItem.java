/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author bruno
 */
public final class PorItem extends Empregado {

    private double producao;//salario por produção
    private int quantidade;//quantidade produzida

    public PorItem(String n, String f, double p, int q) {
        super(n, f);
        setProducao(p);
        setQuantidade(q);
    }

    public void setProducao(double p) {
        producao = (p > 0 ? p : 0.0);
    }

    public void setQuantidade(int q) {
        quantidade = (q > 0 ? q : 0);
    }

    @Override
    public double ganha() {
        return quantidade * producao;
    }

    @Override
    public String toString() {
        return "Por Item: " + super.toString();
    }

}
