<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Respuesta</title>
    </head>
    <body>
        <h1>Datos ingresados:</h1>
        <div>
            Usuario: <%=request.getParameter("user")%>
            <br>
            Correo electr&oacute;nico: <%=request.getParameter("correo")%>
            <br>
            Contrasenia: <%=request.getParameter("contra")%>
            <br>
            Fecha de nacimiento: <%=request.getParameter("fecha")%>
        </div>
    </body>
</html>
