
<%@page import="java.util.ArrayList"%>
<%
    if(session.getAttribute("carrito")==null){
       ArrayList<String> laux=new ArrayList<String>();
       
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>CARRITO DE COMPRAS   </h1>
        <a href="ProcesaServlet">Vaciar carrito</a>
        <p>Escribe los producctos para añadir al carrito</p>
        <form action="ProcesaServlet" method="post">
            <label> Producto: </label>
            <input type="text" name="producto">
            <input type="submit">        
        </form>
        <p>los producctos seleccionados son: </p>
        <ul>
            <li>Producto 1</li>
            <li>Producto 2</li>
            <li>Producto 3</li>
        </ul>
    </body>
</html>
