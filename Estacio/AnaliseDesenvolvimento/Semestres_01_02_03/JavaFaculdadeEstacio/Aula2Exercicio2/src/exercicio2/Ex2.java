package exercicio2;

public class Ex2 {

    public static void main(String[] args) {
        int i = 393;
        byte b;
        b = (byte) i;
        System.out.println("O valor de b é" + b);
    }

}
/* O número 393 é representado em base dois pelo número 110001001,
que tem 9 bits de comprimento (omitimos os zeros não significativos).
Como a variável b é do tipo byte e seu comprimento é de apenas 8 bits, 
teremos os 8 primeiros bits da direita para a esquerda atribuídos a b, isto é,
10001001, que representa o número -119 em base dois, na notação de complemento
de dois.*/
