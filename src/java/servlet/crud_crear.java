/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import jpa_db.Juegos;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jpa_session.JuegosFacadeLocal;


/**
 *
 * @author lalo
 */
public class crud_crear extends HttpServlet {

    @EJB
    private JuegosFacadeLocal juegosFacade;

    

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
            
            escribir(request);
       
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet bd_juegos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet bd_juegos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
      public void escribir(HttpServletRequest request)
    {
        
        try {
        String juego_cod = request.getParameter("j_cod");
        int juego_codint = Integer.parseInt(juego_cod);
        String juego_nombre= request.getParameter("j_nombre");
        String juego_trailer  = request.getParameter("j_video");
        String juego_valor = request.getParameter("j_valor");
        String juego_URL_IMG = request.getParameter("j_img");
        String juego_req_min = request.getParameter("j_req_min");
        String juego_req_max = request.getParameter("j_req_max");
        String juego_descripcion = request.getParameter("j_descripcion");
        
         Juegos crear = new Juegos(juego_codint, juego_nombre, juego_descripcion, juego_valor, juego_req_min, juego_req_max, juego_URL_IMG, juego_trailer);
           
         juegosFacade.create(crear);
              
            
       
        } catch (Exception e) {
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
