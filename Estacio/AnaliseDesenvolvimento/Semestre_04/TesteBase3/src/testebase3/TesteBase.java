/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testebase3;

import java.util.function.Consumer;

/**
 *
 * @author bruno
 */
public class TesteBase {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws  Exception{
        // TODO code application logic here
        ProdutoDAO dao = new ProdutoDAO();
        dao.obterTodos().forEach((p) -> {
            System.out.println("Produto "+p.codigo+": "+p.nome+ "::"+p.quantidade);
        });
    }
    
}
