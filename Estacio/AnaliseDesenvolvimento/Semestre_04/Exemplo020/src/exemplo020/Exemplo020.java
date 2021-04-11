/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo020;

/**
 *
 * @author bruno
 */
public class Exemplo020 {
    
    public static void main(String[] args) {
      Pilha pilha1 = new Pilha<>();
      pilha1.empilhar(5);
      pilha1.empilhar(7);
      pilha1.empilhar(9);
      Integer x;
      while((x=(Integer)pilha1.desempilhar())!=null)
      System.out.println(x);
   }
}