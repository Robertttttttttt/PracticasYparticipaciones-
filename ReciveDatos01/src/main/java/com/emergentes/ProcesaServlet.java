
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recibo tatos del formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String curso = request.getParameter("curso");
        
        //Instanciar un objeto apartir de la persona 
        Persona per=new Persona();
        
        //Encapsulamos los datos recibidos en el opjeto Per 
        per.setNombre(nombre);
        per.setApellido(apellido);
        per.setCurso(curso);
        
        //Colocamos al objeop per como atributo de recuest 
        request.setAttribute("person",per);
        //Derivamos el control a OUTPUT.jsp incluye al objeto recuest
        request.getRequestDispatcher("outsalida.jsp").forward(request, response);
        
    }


}
