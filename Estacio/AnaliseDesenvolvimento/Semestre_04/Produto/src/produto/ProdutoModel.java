/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bruno
 */
public class ProdutoModel extends AbstractTableModel{
    private final ArrayList<Produto> lista =  new ArrayList<>();
    String[] colunas = {"Codigo", "Nome", "Quantidade"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return lista.get(linha).getCodigo();
            case 1:
                return lista.get(linha).getNome();
            case 2:
                return lista.get(linha).getQuantidade();
            default: return null;
        }
    }
    public void addProduto (Produto p ){
        lista.add(p);
        fireTableDataChanged();
    }

}
