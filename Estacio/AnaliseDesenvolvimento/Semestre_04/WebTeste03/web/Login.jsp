<%-- 
    Document   : ServletLogin
    Created on : 12/09/2019, 13:25:19
    Author     : bruno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h1>Acesso ao sistema</h1>
        <form action="ServletLogin" method="post">
            <input type="hidden" name="acao" value="conectar"/>
            login: <input type="text" name="login"/>
            Senha: <input type="password" name="senha"/>
            Senha: <input type="submit" value="login"/>
        </form>
        <%
            if(request.getAttribute("erro")!=null){
                %>
                <hr/>Ocorreu um erro: <%=request.getAttribute("erro")%>
                <%
            }
                %>
    </body>
</html>
