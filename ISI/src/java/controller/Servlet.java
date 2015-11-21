package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Sanduiche;
import model.Subway;

/**
 *
 * @author Guto Leoni
 */
public class Servlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
    /*@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }*/

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

        String tipoPao = request.getParameter("tipo-pao");
        int tamanho = Integer.parseInt(request.getParameter("tamanho"));
        String recheio = request.getParameter("tipo-recheio");
        String queijo = request.getParameter("tipo-queijo");
        
        //pegando adicionais
        boolean cbAdicional1 = request.getParameter("bacon") != null;
        boolean cbAdicional2 = request.getParameter("tomaSeco") != null;
        boolean cbAdicional3 = request.getParameter("chreamCheese") != null;
        
        ArrayList<Boolean> adicional = new ArrayList<>();
        adicional.add(cbAdicional1);
        adicional.add(cbAdicional2);
        adicional.add(cbAdicional3);
        
        //pegando vegetais
        boolean cbVegetal1 = request.getParameter("") != null;
        boolean cbVegetal2 = request.getParameter("") != null;
        boolean cbVegetal3 = request.getParameter("") != null;
        boolean cbVegetal4 = request.getParameter("") != null;
        boolean cbVegetal5 = request.getParameter("") != null;
        boolean cbVegetal6 = request.getParameter("") != null;
        boolean cbVegetal7 = request.getParameter("") != null;
        
        ArrayList<Boolean> vegetal = new ArrayList<>();
        vegetal.add(cbVegetal1);
        vegetal.add(cbVegetal2);
        vegetal.add(cbVegetal3);
        vegetal.add(cbVegetal4);
        vegetal.add(cbVegetal5);
        vegetal.add(cbVegetal6);
        vegetal.add(cbVegetal7);
        
        //pegando molhos
        boolean cbMolho1 = request.getParameter("") != null;
        boolean cbMolho2 = request.getParameter("") != null;
        
        ArrayList<Boolean> molho = new ArrayList<>();
        molho.add(cbMolho1);
        molho.add(cbMolho2);
           
        Subway sub = new Subway();
        Sanduiche sanduba = new Sanduiche(tipoPao, tamanho, recheio, queijo, adicional, vegetal, molho);
        ArrayList <Sanduiche> snd = new ArrayList <>();
        sub.setSanduiche(snd);
        
        
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
