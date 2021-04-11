<%-- 
    Document   : exemplo001
    Created on : 12/04/2020, 18:06:39
    Author     : brunocs
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
                String[] cores = {"vermelho", "verde", "azul"};
                for(String x: cores)
                    out.println("<li>"+x+"</li>");
            %>
        </ul>
    </body>
</html>
