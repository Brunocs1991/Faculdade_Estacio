
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bruno
 */
public class B {

    /**
     * Nesse exemplo, como IOException é uma exceção verificada, o compilador
     * exige que o método f() declare explicitamente que pode lançar a exceção,
     * colocando a frase "throws IOException" no seu cabeçalho. *
     */
    public void f(int a) throws IOException {
        if (a < 20) {
            throw new IOException("valor do argumento de f() e' " + a + " (menor que 20)");
        }
        System.out.println("a = " + a);
    }
}
