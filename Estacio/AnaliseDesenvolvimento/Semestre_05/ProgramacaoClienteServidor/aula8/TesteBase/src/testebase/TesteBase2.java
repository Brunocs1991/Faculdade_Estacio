/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testebase;

/**
 *
 * @author brunocs
 */
public class TesteBase2 {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        dao.obterTodos().forEach((p) -> {
            System.out.println(p);
        });
    }
}
