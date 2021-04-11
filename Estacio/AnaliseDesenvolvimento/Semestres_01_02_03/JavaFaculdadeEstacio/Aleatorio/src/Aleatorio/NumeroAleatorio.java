package Aleatorio;

import java.util.Random;

class Aleatorio {

    int numero;

    Aleatorio(int max) {
        numero = new Random().nextInt(max);
    }
}

public class NumeroAleatorio {

    private String nome;
    private Aleatorio valor;

    NumeroAleatorio(String nome, int valor) {
        this.nome = nome;
        this.valor = new Aleatorio(valor);
    }

    public static void main(String[] args) {
        NumeroAleatorio n;
        n = new NumeroAleatorio("Numero Secreto", 50);

    }

}
