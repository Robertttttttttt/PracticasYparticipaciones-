
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inscripcion de curso  (vesio01)</h1>
        <form action="ProcesaServlet" method="post">
            <label>Nombre:</label>
            <input type="text" name="nombre" value="">
            <br>
            
            <label>Apellido:</label>
            <input type="text" name="apellido" value="" />
            <br>
            
            <label>Curso</label>
            <select name="curso" >
                <option value="1">Primer semestre </option>
                <option value="2">Segundo semestre</option>
                <option value="3">Tercer semestre</option>
                <option value="4">Cuarto emestre</option>
                <option value="5">Quinto semestre</option>
                <option value="6">Sexto semestre</option>
                <option value="7">Septimo semestre</option>
                <option value="8">Octavo semestre</option>
                <option value="9">Noveno semestre</option>
                <option value="10">Desimo semestre</option>
            </select> 
            <br>
            
            <input type="submit" value="Enviar" />
        </form>  
    </body>
</html>

