/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.*;


/**
 *
 * @author bruno
 */
public class ProdutoDAO {
     private Connection getcConnection() throws Exception{
         Class.forName("org.apache.derby.jdbc.ClientDriver");
         return DriverManager.getConnection(
             "jdbc:derby://localhost:1527/LojaEAD",
             "LojaEAD", "LojaEAD");
     }
     private Statement getStatement() throws Exception{
         return getcConnection().createStatement();
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
            } catch (Exception e) {
            }
        return lista;
    }
    public void incluir(Produto p){
        try {
             PreparedStatement ps = getcConnection().prepareStatement("INSERT INTO PRODUTO VALUES(?,?,?)");
             ps.setInt(1, p.getCodigo());
             ps.setString(2, p.getNome());
             ps.setInt(3, p.getQuantidade());
             ps.executeUpdate();
             closeStatement(ps);
        }catch(Exception e){
        }
    }
    public void excluir(int codigo){
        try {
            Statement st = getStatement();
            st.executeUpdate("DELETE FROM PRODUTO WHERE CODIGO = "+codigo);
            closeStatement(st);
        }catch(Exception e){
        }
    }
}
