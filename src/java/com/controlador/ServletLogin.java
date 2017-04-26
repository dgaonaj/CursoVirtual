/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.modelo.Administrador;
import com.modelo.Docente;
import com.modelo.Estudiante;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author damian
 */
@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String tipoUsuario = request.getParameter("tipoUsuario");
        String accion = request.getParameter("accion");
        int pkeyUsuario;
        HttpSession sesion = request.getSession();
        String mensaje;
        
        if(accion.equals("ingresar")){
            if(tipoUsuario.equals("estudiante")){       
                Estudiante estu = new Estudiante();
                pkeyUsuario=estu.login(username, password);
                if(pkeyUsuario != 0){
                    mensaje="Login Correcto";
                    sesion.setAttribute("mensaje", mensaje);
                    sesion.setAttribute("estudiante", pkeyUsuario);
                    request.getRequestDispatcher("dashboard_estudiante.jsp").forward(request, response);                    
                }else{
                    mensaje="Login Incorrecto";
                    sesion.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("login.jsp").forward(request, response);                  
                }
            }else{
                if(tipoUsuario.equals("docente")){
                    Docente doce = new Docente();
                    pkeyUsuario=doce.login(username, password);
                    if(pkeyUsuario!=0){
                        mensaje="Login Correcto";
                        sesion.setAttribute("mensaje", mensaje);
                        sesion.setAttribute("docente", pkeyUsuario);
                        request.getRequestDispatcher("index.jsp").forward(request, response); 
                    }else{
                        mensaje="Login Incorrecto";
                        sesion.setAttribute("mensaje", mensaje);
                        request.getRequestDispatcher("login.jsp").forward(request, response); 
                    }
                }else{
                    if(tipoUsuario.equals("administrador")){
                        Administrador admin = new Administrador();
                        pkeyUsuario=admin.login(username, password);
                        if(pkeyUsuario!=0){
                            mensaje="Login Correcto";
                            sesion.setAttribute("mensaje", mensaje);
                            sesion.setAttribute("administrador", pkeyUsuario);
                            request.getRequestDispatcher("crear_cursos.jsp").forward(request, response); 
                        }else{
                            mensaje="Login Incorrecto";
                            sesion.setAttribute("mensaje", mensaje);
                            request.getRequestDispatcher("login.jsp").forward(request, response);
                        }
                    }
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
