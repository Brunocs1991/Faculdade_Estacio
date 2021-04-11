/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class TesteExc3 {

    /**
     * Neste exemplo, o bloco catch não existe, apenas o try e o finally. Com
     * esse valor de a, a exceção não será lançada. Nesse caso, o código depois
     * do bloco finally também será executado. *
     */
    public static void main(String[] args) {
        try {
            A x = new A();
            int a = 34;
            x.f(a);
        } finally {
            System.out.println("fim do bloco try em TesteExc");
        }
        System.out.println("fim do metodo main em TesteExc");
    }
}
