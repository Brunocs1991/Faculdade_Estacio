/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import model.Produto;

/**
 *
 * @author bruno
 */
@Named(value = "produtoMB")
@SessionScoped
public class ProdutoMB extends Produto{
    private boolean inclusao = false;
    /**
     * Creates a new instance of ProdutoMB
     */
    public ProdutoMB() {
    }

    public boolean isInclusao() {
        return inclusao;
    }

    public void setInclusao(boolean inclusao) {
        this.inclusao = inclusao;
    }
    
    
}
