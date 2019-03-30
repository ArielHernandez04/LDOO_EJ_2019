/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ariel
 */
@WebServlet(urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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
            HttpSession session = request.getSession(true);
            PrintWriter out = response.getWriter();
            Cookie cookie[];
            if(request.getCookies() != null){
            cookie = request.getCookies();
            }else {
            cookie = null;
            }
            Usuario us = (Usuario) session.getAttribute("us");
            String user = request.getParameter("user");
            String password = request.getParameter("password");
            String sesionid = session.getId();
            String sesionidcookie = "sesionidcookie";
            if(cookie != null){
            sesionidcookie = cookie[0].getValue();
            response.addCookie(cookie[0]);
            }
            
            if(cookie != null){
                if(user.equals(us.getUser())){
                    if(password.equals(us.getPassword())){
                        if(sesionid.equals(sesionidcookie)){
                          out.println("<html>");
                          out.println("<head>");
                          out.println("<title>Bienvenido</title>");
                          out.println("</head>");
                          out.println("<body>");
                          out.println("<h1>Bienvenido</h1>");
                          out.println("</body>");
                          out.println("</html>");
                        }
                    }
                }
            }
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

