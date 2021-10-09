


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="person" scope="request" class="com.emergentes.Persona" />
        <h1>Los datos recibidos son:</h1>
        <p> Nombre: <jsp:getProperty name="person" property="nombre" /></p>
        <p>Apellido: <jsp:getProperty name="person" property="telefono" /></p>
        <p>Curso: <jsp:getProperty name="person" property="correo" /></p>
        
        <a href="index.jsp">Volver</a>
    </body>
</html>
