/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo003;

/**
 *
 * @author bruno
 */
public class Exemplo003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5, b = 32, c = 7;
        boolean x;
        x = a < b;
        System.out.println("PASSO 1: "+x);
        x = (b > a) && (c > b);
        System.out.println("PASSO 2: "+x);
        b /= a -= 1;
        c++;
        x = (b==c);
        System.out.println("PASSO 3: "+x);
    }
    
}
