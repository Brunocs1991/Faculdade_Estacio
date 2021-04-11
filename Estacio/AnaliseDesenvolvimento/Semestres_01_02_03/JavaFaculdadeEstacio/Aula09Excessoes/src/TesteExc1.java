/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class TesteExc1 {

    /**
     * Neste exemplo, a exceção será capturada, e as três mensagens serão
     * exibidas. Ou seja, mesmo depois de finally executar, o restante do método
     * main continua. *
     */
    public static void main(String[] args) {
        try {
            A x = new A();
            int a = 4;
            x.f(a);
        } catch (Exception e) {
            System.out.println("valor ilegal de a");
        } finally {
            System.out.println("fim do bloco try em TesteExc");
        }
        System.out.println("fim do metodo main em TesteExc");
    }
}
