/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testebase2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author bruno
 */
public class ProdutoDAO {
    private Connection getConnection() throws Exception{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    return DriverManager.getConnection("jdbc:derby://localhost:1527/LojaEAD","LojaEAD", "LojaEAD");
    }
    private Statement getStatement() throws Exception{
        return getConnection().createStatement();
    }
    private void closeStatement(Statement st) throws Exception{
        st.getConnection().close();
    }
    public List<Produto> obterTodos(){
        ArrayList<Produto> lista = new ArrayList<>();
        
        try {
            ResultSet r1 = getStatement().executeQuery("SELECT * FROM PRODUTO");
            while(r1.next())
                lista.add(new Produto(r1.getInt("codigo"),r1.getString("nome"),r1.getInt("quantidade")));
            closeStatement(r1.getStatement());
        } catch (Exception ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}