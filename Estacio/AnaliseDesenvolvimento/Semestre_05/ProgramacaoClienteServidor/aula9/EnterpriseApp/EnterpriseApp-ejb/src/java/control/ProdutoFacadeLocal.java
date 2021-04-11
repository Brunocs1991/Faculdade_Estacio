/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.ejb.Local;
import model.Produto;

/**
 *
 * @author brunocs
 */
@Local
public interface ProdutoFacadeLocal {

    void create(Produto produto);
    void edit(Produto produto);
    void remove(Produto produto);
    Produto find(Object id);
    List<Produto> findAll();
    List<Produto> findRange(int[] range);
    int count();
}
