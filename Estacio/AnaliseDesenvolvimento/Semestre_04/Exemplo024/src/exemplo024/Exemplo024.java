/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo024;

/**
 *
 * @author bruno
 */
public class Exemplo024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object[] objetos =  {new Carro(), "XPTO"};
        for(Object obj: objetos){
            Class c1 = obj.getClass();
            if(c1.isAnnotationPresent(Autoria.class)){
                Autoria a1 = (Autoria)c1.getAnnotation(Autoria.class);
                System.out.println("Classe "+ c1.getName() + " escrita por "+ a1.autor() + " em " + a1.ano());                
            }else{
                System.out.println("Classe "+ c1.getName()+" sem autoria definita");
            }
        }
    }
}
