/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unesa;

/**
 *
 * @author brunocs
 */
public class CalculadoraResult {

    private int a;
    private int b;
    private String operacao;
    private int resultado;
    public CalculadoraResult() {
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getOperacao() {
        return operacao;
    }

    public int getResultado() {
        return resultado;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
}
