/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class A {

    /**
     * Neste exemplo, a classe A tem um metodo f() que pode lançar uma exceção
     * do tipo NumberFormatException, que e' nao verificada. Por esse motivo, o
     * método f() não precisa incluir a terminação "throws
     * NumberFormatException". *
     */
    public void f(int a) {
        if (a < 20) {
            throw new NumberFormatException();
        }
        System.out.println("a = " + a);
    }
}
