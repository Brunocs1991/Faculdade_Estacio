/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo004;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Exemplo004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s1 =new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO:");
        int x = s1.nextInt();
        if(x%2==0)
            System.out.println("O NÚMERO É PAR");
        else
            System.out.println("O NÚMERO É ÍMPAR");
    }
    
}
