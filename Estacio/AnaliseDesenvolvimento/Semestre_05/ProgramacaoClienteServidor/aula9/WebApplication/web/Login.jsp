<%-- 
    Document   : Login
    Created on : 26/04/2020, 20:21:59
    Author     : brunocs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

    <body>

        <h1>Acesso ao Sistema</h1>

        <form action="ServletLogin" method="post">

            Login: <input type="text" name="login"/>

            Senha: <input type="password" name="senha"/>

            <input type="submit" value="login"/>

        </form>

        <%

            if (request.getAttribute("erro") != null) {

        %>

        <hr/>Ocorreu um erro: <%=request.getAttribute("erro")%>

        <%

            }

        %>

    </body>

</html>