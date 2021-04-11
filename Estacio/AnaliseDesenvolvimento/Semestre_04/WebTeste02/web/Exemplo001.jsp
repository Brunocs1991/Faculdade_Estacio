<%-- 
    Document   : Exemplo001
    Created on : 12/09/2019, 12:17:29
    Author     : bruno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <%
                String[] cores = {"Vermelho", "Verde", "Azul"};
                for(String x: cores){
                    out.println("<li>"+x+"</li>");
                }
            %>
        </ul>
    </body>
</html>
