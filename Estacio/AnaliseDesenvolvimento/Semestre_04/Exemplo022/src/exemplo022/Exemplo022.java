/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo022;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Exemplo022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<Integer, String> produtos = new HashMap<>();
        int opcao;
        do{
            System.out.println("Digite 1 para incluir, 2 para consultar, 0 para sair");
            opcao = teclado.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Código do novo produto:");
                    int codigoN = teclado.nextInt();
                    System.out.println("Nome do produto:");
                    String nomeN = teclado.next();
                    produtos.put(codigoN, nomeN);
                    break;
                case 2:
                    System.out.println("Digite o código:");
                    int codigo = teclado.nextInt();
                    String nome = produtos.get(codigo);
                    if(nome!= null){
                        System.out.println(nome);
                    }
                    break;
            }
        }while(opcao!=0);   
    }
}
