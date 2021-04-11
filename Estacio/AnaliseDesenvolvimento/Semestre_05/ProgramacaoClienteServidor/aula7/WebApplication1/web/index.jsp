<%-- 
    Document   : index
    Created on : 18/04/2020, 15:19:45
    Author     : brunocs
--%>
<%@page import="testebase.Produto"%>
<%@page import="testebase.ProdutoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form>
            Codigo:<br/>
            <input type="text" name="codigo"/><br/>
            Nome:<br/>
            <input type="text" name="nome"/><br/>
            Quantidade:<br/>
            <input type="text" name="quantidade"/><br/>
            <input type="submit" value="Adicionar"/>
        </form>
        <hr/>
        <ul>
            <%
                ProdutoDAO dao = new ProdutoDAO();
                if(request.getParameter("codigo")!= null){
                    Produto p1 = new Produto();
                    p1.codigo = new Integer(request.getParameter("codigo"));
                    p1.nome = request.getParameter("nome");
                    p1.quantidade = new Integer(request.getParameter("quantidade"));
                    dao.incluir(p1);
                }
                for(Produto p: dao.obterTodos()){
                    %>
                    <li><%=p.codigo%> - <%=p.nome%> :: <%=p.quantidade%></li>
                <% } %>
        </ul>
    </body>
</html>
