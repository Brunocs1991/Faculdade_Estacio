
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
public class TesteExc8 {

    /**
     * Neste exemplo, a exceção que pode ser lançada por f() e' verificada
     * (IOException), e o método main() tem a clausula "throws IOException",
     * compilando OK. *
     */
    public static void main(String[] args) throws IOException {
        B x = new B();
        int a = 4;
        x.f(a);
        System.out.println("fim do metodo main em TesteExc");
    }
}
