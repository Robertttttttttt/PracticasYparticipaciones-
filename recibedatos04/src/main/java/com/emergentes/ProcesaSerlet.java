/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ProcesaSerlet", urlPatterns = {"/ProcesaSerlet"})
public class ProcesaSerlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recibo los datos de los formunlario
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String password
        
        //Instanciomos un objeto a partir de la clse persona 
        Persona per=new Persona();
       
        //Encapsulamos los datos recibidos en el objeto per
        per.setNombre(nombre);
        per.setTelefono(telefono);
        per.setCorreo(correo);
        
        // colocamos al objeto per como un atributo requeste 
        request.setAttribute("person",per);
        
//Derivamos el control a outsalida.jsp inccluye al objeto request
        request.getRequestDispatcher("outsalid.jsp").forward(request, response);
    }
    }

}
