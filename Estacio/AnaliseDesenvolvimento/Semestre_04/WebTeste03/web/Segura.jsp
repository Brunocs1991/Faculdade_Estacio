<%-- 
    Document   : Segura
    Created on : 12/09/2019, 12:50:01
    Author     : bruno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if(session.getAttribute("usuario")== null){
        response.sendRedirect("Login.jsp");
    }else{
         %>
         <!DOCTYPE html>
         <html>
             <body>
                 <h1>Esta é uma página protegida!</h1>
                 &O usuário <%=session.getAttribute("usuario")%>
                 está logado.<br/>
                 Para desconectar clique <a href="ServletLogin?acao=desconectar">aqui</a>      
             </body>
         </html>
<% } %>
