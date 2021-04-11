/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo008;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Exemplo008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
   int soma = 0;
        int valor;
   do{
     System.out.print("Digite um numero (0 para sair):");
        valor = teclado.nextInt();
        soma += valor;
   }while(valor!=0);
    System.out.printf("\nA soma dos numeros "+"digitados e: %d\n",soma);
    }
    
}
