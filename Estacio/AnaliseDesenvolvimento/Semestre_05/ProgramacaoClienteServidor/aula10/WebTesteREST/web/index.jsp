<%-- 
    Document   : index
    Created on : 02/05/2020, 09:07:01
    Author     : brunocs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
        </script>
    </head>
    <body>
        <input type="text" id="a">
        <input type="text" id="b">
        <button id="somar">somar</button>
        <p id="saida"></p>
        <script>
            $("#somar").click(function () {
                var endereco = "http://localhost:8084/WebTesteREST/" +
                        "webresources/calculadora/somar/" +
                        $("#a").val() + "/" + $("#b").val();
                $.ajax({
                    url: endereco
                }).then(function (data) {
                    $("#saida").html(data.a + " + " + data.b + " = " +
                            data.resultado);
                });
            });
        </script>
    </body>
</html>
