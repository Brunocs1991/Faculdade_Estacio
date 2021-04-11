/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class TesteExc4 {

    /**
     * Neste exemplo, como a exceção que pode ser lançada por f() e' não
     * verificada, o compilador não reclama por não haver a cláusula throws no
     * cabeçalho de main. Mas a exceção será lançada, originando um stack trace,
     * e o método main() não continuará após o ponto da chamada de f().*
     */
    public static void main(String[] args) {
        A x = new A();
        int a = 4;
        x.f(a); // com esse valor, f() lançará exceção
        System.out.println("fim do metodo main em TesteExc");
    }
}
