<%-- 
    Document   : numerosImpares
    Created on : 12/04/2020, 18:20:20
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
        <p>Numeros Ímpares entre 1 a 100</p>
        <ul>
        <%
           for(int i=1; i<=100; i ++){
               if(i %2 != 0){
                   out.println("<li>"+i+"</li>");
               }
           }
        %>
        </ul>
    </body>
</html>
