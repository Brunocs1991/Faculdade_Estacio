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

/**
 *
 * @author bruno
 */
public class TesteBase {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws  Exception{
        // TODO code application logic here
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        // passo 1
        Connection c1 = DriverManager.getConnection(
            "jdbc:derby://localhost:1527/LojaEAD",
            "LojaEAD", "LojaEAD");
        // passo 2
        Statement st = c1.createStatement();
        // passo 3
        ResultSet r1 = st.executeQuery("SELECT * FROM PRODUTO");
        // passo 4 e recepção no ResultSet
        while(r1.next()){
            System.out.println("Produto "+r1.getInt("codigo")+": "+
            r1.getString("nome")+"::"+r1.getInt("quantidade"));
        }
        r1.close();
        st.close();
        c1.close();
    }
}
