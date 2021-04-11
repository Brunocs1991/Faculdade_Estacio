/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import java.util.Scanner;

/**
 *
 * @author brunocs
 */
public class Exemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Double media, nota1, nota2;
        System.out.println("Digite a nota 1:");
        nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a nota 2:");
        nota2 = Double.parseDouble(sc.nextLine());
        media = (nota1 + nota2) / 2.0;
        System.out.println("A sua média é: " + media);
        sc.close();
        
    }
    
}
