/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ProdutoFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import model.Produto;
/**
 *
 * @author bruno
 */
@Named(value = "produtoControlMB")
@ApplicationScoped
public class ProdutoControlMB {

    /**
     * Creates a new instance of ProdutoControlMB
     */
    @EJB
    ProdutoFacadeLocal facade;

    @Inject
    ProdutoMB produtoMB;
    
    public ProdutoControlMB() {
    }
    // Métodos de acesso direto
    public List<Produto> obterTodos(){
        return facade.findAll();
    }
    // Métodos de navegação
    public String listar(){
        return "ListaProduto?faces-redirect=true";
    }
    public String incluir(){
        produtoMB.setCodigo(0);
        produtoMB.setNome("");
        produtoMB.setQuantidade(0);
        produtoMB.setInclusao(true);
        return "DadosProduto?faces-redirect=true";        
    }
    public String alterar(Integer idProduto){
        Produto produto = facade.find(idProduto);
        produtoMB.setCodigo(produto.getCodigo());
        produtoMB.setNome(produto.getNome());
        produtoMB.setQuantidade(produto.getQuantidade());
        produtoMB.setInclusao(false);
        return "DadosProduto?faces-redirect=true";
    }
    public String persistir(){
        return (produtoMB.isInclusao())?incluirX():alterarX();
    }
    public String incluirX(){
        Produto produto = new Produto(produtoMB.getCodigo());
        produto.setNome(produtoMB.getNome());
        produto.setQuantidade(produtoMB.getQuantidade());
        facade.create(produto);
        return listar();
    }
    public String alterarX(){
        Produto produto = facade.find(produtoMB.getCodigo());
        produto.setNome(produtoMB.getNome());
        produto.setQuantidade(produtoMB.getQuantidade());
        facade.edit(produto);
        return listar();
    }
    public String excluirX(Integer idProduto){
        facade.remove(facade.find(idProduto));
        return listar();
    }
}
