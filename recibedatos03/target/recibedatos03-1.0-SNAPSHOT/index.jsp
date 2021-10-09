
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de datos 03!</h1>
        <form action="ProcesoSerlet" method="post">
            <label>Nombre:</label>
            <input type="text" name="nombre" value="">
            <br>
            
            <label>Apellido:</label>
            <input type="text" name="apellido" value="" />
            <br>
            
            <label>Curso</label>
            <select name="curso">
                <option value="1er Semestre">Primer Semestre</option>
                <option value="2do Semestre">Segundo Semestre</option>
                <option value="3er Semestre">Tercer Semestre</option>
                <option value="4to Semestre">Cuarto Semestre</option>
                <option value="5to Semestre">Quinto Semestre</option>
                <option value="6to Semestre">Sexto Semestre</option>
                <option value="7mo Semestre">Septimo Semestre</option>
                <option value="8vo Semestre">Octavo Semestre</option>
                <option value="9no Semestre">Noveno Semestre</option>
                <option value="10mo Semestre">Desimo Semestre</option>
            </select>
            <br>
            
            <input type="submit" value="Enviar" />
        </form>  
    </body>
</html>

