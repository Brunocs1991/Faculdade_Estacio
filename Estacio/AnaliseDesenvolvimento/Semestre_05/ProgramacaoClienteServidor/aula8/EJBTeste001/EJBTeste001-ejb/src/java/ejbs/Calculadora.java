/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbs;

import javax.ejb.Stateless;

/**
 *
 * @author brunocs
 */
@Stateless
public class Calculadora implements CalculadoraLocal {

    @Override
    public int somar(int a, int b) {
        return a + b;
    }

    @Override
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
