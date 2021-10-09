
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesoSerlet", urlPatterns = {"/ProcesoSerlet"})
public class ProcesoSerlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recibo los datos de los formunlario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String curso = request.getParameter("curso");
        
        //Instanciomos un objeto a partir de la clse persona 
        Persona per=new Persona();
       
        //Encapsulamos los datos recibidos en el objeto per
        per.setNombre(nombre);
        per.setApellido(apellido);
        per.setCurso(curso);
        
        // colocamos al objeto per como un atributo requeste 
        request.setAttribute("person",per);
        
//Derivamos el control a outsalida.jsp inccluye al objeto request
        request.getRequestDispatcher("outsalida.jsp").forward(request, response);
    }

}
