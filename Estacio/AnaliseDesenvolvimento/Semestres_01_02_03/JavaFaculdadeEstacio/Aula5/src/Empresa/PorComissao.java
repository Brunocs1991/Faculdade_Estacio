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
public final class PorComissao extends Empregado {

    private double salario;
    private double comissao; // comissão por item vendido
    private int vendas;// numero de itens vendidos

    public PorComissao(String n, String f, double s, double c, int v) {
        super(n, f);
        setSalario(s);
        setComissao(c);
        setVenda(v);
    }

    public void setSalario(double s) {
        salario = (s > 0 ? s : 0.0);
    }

    public void setComissao(double c) {
        comissao = (c > 0 ? c : 0.0);
    }

    public void setVenda(int v) {
        vendas = (v > 0 ? v : 0);
    }

    @Override
    public double ganha() {
        return salario + comissao*vendas;
    }
    @Override
    public String toString(){
        return "Por Comissao: " + super.toString();
    }

}
