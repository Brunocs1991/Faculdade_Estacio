/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class TesteExc2 {

    /**
     * Neste exemplo, o bloco catch não existe. Portanto, a exceção não será
     * capturada, gerando um stack trace. O bloco finally e' executado, mas não
     * o que segue depois. *
     */
    public static void main(String[] args) {
        try {
            A x = new A();
            int a = 4;
            x.f(a);
        } finally {
            System.out.println("fim do bloco try em TesteExc");
        }
        System.out.println("fim do metodo main em TesteExc");
    }
}


