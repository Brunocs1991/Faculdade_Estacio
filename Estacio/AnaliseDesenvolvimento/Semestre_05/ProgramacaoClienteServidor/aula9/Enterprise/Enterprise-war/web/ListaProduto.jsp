<%-- 
    Document   : ListaProduto
    Created on : 26/04/2020, 09:41:36
    Author     : brunocs
--%>

<%@page import="model.Produto"%>

<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

    <body>

        <a href="ServletProduto?acao=incluir">Novo Produto</a>

        <table border="1" width="100%">

            <tr><td>Código</td><td>Nome</td>

                <td>Quantidade</td><td>Ação</td>

            </tr>

            <%

                List<Produto> listagem = (List<Produto>) request.getAttribute("listagem");

                for (Produto p : listagem) {

            %>

            <tr><td><%=p.getCodigo()%></td><td><%=p.getNome()%></td>

                <td><%=p.getQuantidade()%></td>

                <td><a href=

                       "ServletProduto?acao=excluirX&codigo=<%=p.getCodigo()%>">

                        Excluir Produto</a></td></tr>

            <% }%>

        </table>

    </body>

</html>
