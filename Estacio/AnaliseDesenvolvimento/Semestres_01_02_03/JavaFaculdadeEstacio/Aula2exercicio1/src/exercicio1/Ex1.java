package exercicio1;

import java.util.Scanner;

/**
 * @author Bruno
 */
public class Ex1 {

    public static void main(String[] args) {

        // variaveis do problema
        int i = 10;
        double d = 9.85;
        char c = 'a';
        boolean b = true;
        int opcao;
        System.out.println("Exercicio 1 aula 2 opções solicitadas");
        System.out.println("1 - Apresentar o valor da variável d");
        System.out.println("2 - Apresentar o conteúdo da variável c;");
        System.out.println("3 - Apresentar a soma inteira de i e d");
        System.out.println("4 - Apresentar o conteúdo da variável b");
        System.out.println("5 - Apresentar o texto positivo caso a variavel b seja true e falso caso contrário");
        System.out.println("6 - sair");
        System.out.println("Opção desejada");
        // entrada da opção desejada
        do {
            Scanner menu = new Scanner(System.in);
            opcao = menu.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Variavel d = " + d);
                    break;
                case 2:
                    System.out.println("Variavel c = " + c);
                    break;
                case 3:
                    int inteiro = (int) d; //convertendo d para inteiro
                    int t = inteiro + i;
                    System.out.println("Soma das variaveis i + d " + t);
                    break;
                case 4:
                    System.out.println("Variavel b = " + b);
                    break;
                case 5:
                    if (b == true) {
                        System.out.println("Positivo");
                    } else {
                        System.out.println("Falso");
                    }
                    break;
                case 7:
                    System.out.println("sistema finalizado");
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        } while (opcao != 6);

    }
}
