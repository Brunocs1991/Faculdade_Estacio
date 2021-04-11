/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class TesteExc5 {

    /**
     * Neste exemplo, como a exceção que pode ser lançada por f() e' do tipo
     * "não verificada", o compilador não reclama do fato de main() não informar
     * que pode lançar uma exceção, com "throws NumberFormatException" ou
     * "throws Exception". Como nesse exemplo a exceção não será lançada, o
     * método main irá até o final. *
     */
    public static void main(String[] args) {
        A x = new A();
        int a = 34;
// com esse valor, f() nao lancará exceção
        x.f(a);
        System.out.println("fim do metodo main em TesteExc");
    }
}
