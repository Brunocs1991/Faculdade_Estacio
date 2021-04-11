/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo11;

/**
 *
 * @author bruno
 */
public class Exemplo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object[] objetos = {new Gato(),new Morcego(), new Cachorro()};
        
        for(int i =0; i<3; i++){
            if(objetos[i] instanceof Voo){
                ((Voo)objetos[i]).voar();
                //conversão do tipo (type cast) nescessaria
            }
        }
    }
    
}
