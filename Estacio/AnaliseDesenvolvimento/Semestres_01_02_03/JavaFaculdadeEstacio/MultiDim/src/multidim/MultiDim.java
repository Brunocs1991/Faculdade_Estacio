/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidim;

/**
 *
 * @author bruno
 */
public class MultiDim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] nomes = {{"Sr. ", "Sra. ", "Srta. "},
        {"Silva", "Santos"}
        };
// Sr. Silva
        System.out.println(nomes[0][0] + nomes[1][0]);
// Srta. Santos
        System.out.println(nomes[0][2] + nomes[1][1]);
    }
}
