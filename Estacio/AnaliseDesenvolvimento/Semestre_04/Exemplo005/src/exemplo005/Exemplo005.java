/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo005;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Exemplo005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s1 =new Scanner(System.in);
       System.out.println("DIGITE O DIA ATUAL:");
       int d = s1.nextInt();
       System.out.println("DIGITE O MÊS ATUAL:");
       int m = s1.nextInt();
       System.out.println("DIGITE O ANO ATUAL:");
       int a = s1.nextInt();
       GregorianCalendar g1 = new GregorianCalendar(a,m-1,d);
       switch(g1.get(GregorianCalendar.DAY_OF_WEEK)){
           case 1:
              System.out.println("DOMINGO! FERIADO! :)");
              break;
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
              System.out.println("DIA ÚTIL! TRABALHANDO. :(");
              break;
           case 7:
              System.out.println("SÁBADO! FERIADO! :)");
              break;
           default :
              System.out.println("ALGO ESTÁ ERRADO....");
              break;
       }
    }
}
