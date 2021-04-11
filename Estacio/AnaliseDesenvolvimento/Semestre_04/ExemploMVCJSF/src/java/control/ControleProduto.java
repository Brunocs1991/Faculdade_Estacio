/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import model.Produto;
import model.ProdutoDAO;

/**
 *
 * @author bruno
 */
public class ControleProduto {
    private final ProdutoDAO dao = new ProdutoDAO();
    public List<Produto> obterProdutos(){
        return dao.obterTodos();
    }
    public void inserirProduto(Produto produto){
        dao.incluir(produto);
    }

    public void excluirProduto(int codigo){
        dao.excluir(codigo);
    }
    public String listar(){
        return "ListaProduto?faces-redirect=true";
    }
    public String inserir(){
        return "InserirProduto?faces-redirect=true";
    }
}
