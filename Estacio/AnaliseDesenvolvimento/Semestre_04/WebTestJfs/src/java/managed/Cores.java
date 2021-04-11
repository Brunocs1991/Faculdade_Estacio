/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
@Named(value = "cores")
@SessionScoped
public class Cores implements Serializable {

    /**
     * Creates a new instance of Cores
     */
    private final List<String> lista = new ArrayList<>();
    private String atual;
    
    public Cores() {}
    public void addCorAtual(){
        lista.add(atual);
        atual = "";    
    }

    public List<String> getListaCores() {
        return lista;
    }
    public String getAtual() {
        return atual;
    }

    public void setAtual(String atual) {
        this.atual = atual;
    }
    
}
