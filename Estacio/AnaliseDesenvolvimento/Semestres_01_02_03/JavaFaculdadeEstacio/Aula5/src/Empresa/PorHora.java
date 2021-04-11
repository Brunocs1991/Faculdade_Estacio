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
public final class PorHora extends Empregado {

    private double valor; // salario por hora
    private double horas; // horas trabalhadas(300 no maximo)

    public PorHora(String n, String f, double h, double v) {
        super(n, f);
        setValor(v);
        setHoras(h);
    }

    public void setHoras(double h) {
        horas = (h >= 0 && h <= 300 ? h : 0.0);
    }

    public void setValor(double v) {
        valor = (v > 0 ? v : 0.0);
    }

    @Override
    public double ganha() {
        return valor * horas;
    }

    public String toString() {
        return "Por Hora: " + super.toString();
    }

}
