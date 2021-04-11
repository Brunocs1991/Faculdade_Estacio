/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbs;

import javax.ejb.Local;

/**
 *
 * @author brunocs
 */
@Local
public interface CalculadoraLocal {
    int somar(int a, int b);
    int subtrair(int a,int b);
}
