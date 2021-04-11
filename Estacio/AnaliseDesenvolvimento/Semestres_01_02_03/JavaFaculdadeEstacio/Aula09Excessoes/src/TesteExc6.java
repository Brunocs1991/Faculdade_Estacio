
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
public class TesteExc6 {

    /**
     * Neste exemplo, usa-se a informação contida no objeto exceção para gerar a
     * mensagem de erro, pois o método f() da classe B cria exceções com uma
     * mensagem informativa. *
     */
    public static void main(String[] args) {
        try {
            B x = new B();
            int a = 4;
            x.f(a);
        } catch (IOException e) {
            System.out.println(e); // imprime toString(e)
        } finally {
            System.out.println("fim do bloco try em TesteExc");
        }
        System.out.println("fim do metodo main em TesteExc");
    }
}
