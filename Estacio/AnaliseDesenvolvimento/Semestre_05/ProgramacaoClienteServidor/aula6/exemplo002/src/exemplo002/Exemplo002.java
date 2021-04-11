/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo002;

/**
 *
 * @author brunocs
 */
public class Exemplo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //Calculo do valor médio da sequencia y = f(x) = x*x
        //media = somatorio dos valores / pela quantidade
        // limite de 1 a 5
        double soma = 0.0;
        for (int x=1; x<=5; x++){
            soma += Math.pow(x,2);
            // eleva x a potência 2 e acumula 
        }
        System.out.println(soma/5);
    }
}
