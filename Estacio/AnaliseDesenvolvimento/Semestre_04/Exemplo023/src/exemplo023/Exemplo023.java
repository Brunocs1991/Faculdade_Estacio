/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo023;

import java.lang.reflect.Field;

/**
 *
 * @author bruno
 */
public class Exemplo023 {
    public static void main(String[] args) throws Exception {
        Object objeto = Class.forName("exemplo023.Pessoa").newInstance();
        Class classe = objeto.getClass();
        //reconhecendo os atributos do objeto ...
        for(Field f: classe.getFields())
            System.out.println(f.getName()+"::"+f.getType());
        // alterando os valores e invocando o método ...
        classe.getField("nome").set(objeto, "João");
        classe.getField("telefone").set(objeto, "1111-1111");
        classe.getMethod("exibir", int.class).invoke(objeto, 2);
    }
}
