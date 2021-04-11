
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
public class TesteExc7 {

    /**
     * Neste exemplo, o compilador reclama porque a exceção que pode ser lançada
     * por f() é do tipo "verificada" (IOException), e o método main() não tem a
     * clausula "throws IOException" *
     */
    public static void main(String[] args) throws IOException {
        B x = new B();
        int a = 34;
        x.f(a);
        System.out.println("fim do metodo main em TesteExc");
    }
}
