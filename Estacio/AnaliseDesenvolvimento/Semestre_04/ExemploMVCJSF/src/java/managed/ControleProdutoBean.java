/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author bruno
 */
@Named(value = "controleProduto")
@Dependent
public class ControleProdutoBean extends control.ControleProduto{

    @ApplicationScoped
    public String inserirProduto(ProdutoBean produto){
       super.inserirProduto(produto);
       return "ListaProduto?faces-redirect=true";
    }
    
}
