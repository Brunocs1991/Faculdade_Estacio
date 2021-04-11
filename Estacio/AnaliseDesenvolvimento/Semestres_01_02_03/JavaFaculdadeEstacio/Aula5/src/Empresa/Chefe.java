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
public final class Chefe extends Empregado {

    private double salario;

    public Chefe(String n, String f, double s) {
        super(n, f);
        setSalario(s);
    }

    public void setSalario(double s) {
        salario = (s > 0 ? s : 0.0);
    }

    @Override
    public double ganha() {
        return salario;
    }

    @Override
    public String toString() {
        return "Chefe: " + super.toString();
    }

}
