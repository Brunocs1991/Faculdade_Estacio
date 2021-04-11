/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo009r;

/**
 *
 * @author bruno
 */
public class Exemplo009R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contagem = 0;
    int atual = 1;
    while(contagem< 10){
       atual++;
       boolean ePrimo = true;
       for(int i=2; i< atual; i++)
          if(atual%i==0)
             ePrimo = false;
       if(ePrimo){
          contagem++;
          System.out.println(atual);
       }
    }
 }
}