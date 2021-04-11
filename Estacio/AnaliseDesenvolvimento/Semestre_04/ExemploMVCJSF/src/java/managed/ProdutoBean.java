/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import model.Produto;

/**
 *
 * @author bruno
 */
@Named(value = "produto")
@RequestScoped
public class ProdutoBean extends Produto{
}
