package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
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

        Subway sub = new Subway();

        //pegando adicionais
        boolean cbAdicional1 = request.getParameter("adicional") != null;
        boolean cbAdicional2 = request.getParameter("adicional") != null;
        boolean cbAdicional3 = request.getParameter("adicional") != null;

        ArrayList<Boolean> adicional;
        adicional = sub.checaItem(cbAdicional1, cbAdicional2, cbAdicional3, false, false, false, false);

        //pegando vegetais
        boolean cbVegetal1 = request.getParameter("vegetais") != null;
        boolean cbVegetal2 = request.getParameter("vegetais") != null;
        boolean cbVegetal3 = request.getParameter("vegetais") != null;
        boolean cbVegetal4 = request.getParameter("vegetais") != null;
        boolean cbVegetal5 = request.getParameter("vegetais") != null;
        boolean cbVegetal6 = request.getParameter("vegetais") != null;
        boolean cbVegetal7 = request.getParameter("vegetais") != null;

        ArrayList<Boolean> vegetal = sub.checaItem(cbVegetal1, cbVegetal2, cbVegetal3, cbVegetal4, cbVegetal5, cbVegetal6, cbVegetal7);

        //pegando molhos
        boolean cbMolho1 = request.getParameter("molho") != null;
        boolean cbMolho2 = request.getParameter("molho") != null;
        boolean cbMolho3 = request.getParameter("molho") != null;
        boolean cbMolho4 = request.getParameter("molho") != null;
        boolean cbMolho5 = request.getParameter("molho") != null;
        boolean cbMolho6 = request.getParameter("molho") != null;
        ArrayList<Boolean> molho = sub.checaItem(cbMolho1, cbMolho2, cbMolho3, cbMolho4, cbMolho5, cbMolho6, false);

        //instâncias 
        Sanduiche sanduba = new Sanduiche(tipoPao, tamanho, recheio, queijo, adicional, vegetal, molho);
        ArrayList<Sanduiche> arrayListSanduba = new ArrayList<>();
        arrayListSanduba.add(sanduba);
        sub.setSanduiche(arrayListSanduba);
        
        
        List resultado = sub.getBrands();
        
        request.setAttribute("styles", resultado);
        RequestDispatcher view = request.getRequestDispatcher("resultado.jsp");
        view.forward(request, response);

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
