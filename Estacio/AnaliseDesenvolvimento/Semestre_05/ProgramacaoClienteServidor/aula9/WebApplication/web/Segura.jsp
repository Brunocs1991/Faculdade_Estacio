<%-- 
    Document   : Segura
    Created on : 26/04/2020, 20:21:07
    Author     : brunocs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    if (session.getAttribute("usuario") == null)

        response.sendRedirect("Login.jsp");

    else {

%>

<!DOCTYPE html>

<html>

    <body>

        <h1>Esta é uma página protegida!</h1>

        O usuário <%=session.getAttribute("usuario")%> está logado.

    </body>

</html>

<% }%>