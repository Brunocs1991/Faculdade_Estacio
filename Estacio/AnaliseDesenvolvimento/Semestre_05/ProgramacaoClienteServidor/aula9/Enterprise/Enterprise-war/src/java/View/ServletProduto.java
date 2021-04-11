/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import control.ProdutoFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import model.Produto;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author brunocs
 */
@WebServlet(name = "ServletProduto", urlPatterns = {"/ServletProduto"})
public class ServletProduto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @EJB
    ProdutoFacadeLocal facade;

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String acao = request.getParameter("acao");

        if (acao == null) {
            acao = "listar";
        }

        String pagDestino = (acao.equals("incluir"))
                ? "incluirProduto.html" : "ListaProduto.jsp";

        if (acao.equals("incluirX")) {

            Produto p1 = new Produto(new Integer(
                    request.getParameter("codigo")));

            p1.setNome(request.getParameter("nome"));

            p1.setQuantidade(new Integer(
                    request.getParameter("quantidade")));

            facade.create(p1);

        }

        if (acao.equals("excluirX")) {

            facade.remove(facade.find(new Integer(
                    request.getParameter("codigo"))));

        }

        request.setAttribute("listagem", facade.findAll());

        request.getRequestDispatcher(pagDestino).
                forward(request, response);

    }

    /*
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
 /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletProduto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletProduto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
        String acao = request.getParameter("acao");

        if (acao == null) {
            acao = "listar";
        }

        String pagDestino = (acao.equals("incluir"))
                ? "incluirProduto.html" : "ListaProduto.jsp";

        if (acao.equals("incluirX")) {

            Produto p1 = new Produto(new Integer(
                    request.getParameter("codigo")));

            p1.setNome(request.getParameter("nome"));

            p1.setQuantidade(new Integer(
                    request.getParameter("quantidade")));

            facade.create(p1);

        }

        if (acao.equals("excluirX")) {

            facade.remove(facade.find(new Integer(
                    request.getParameter("codigo"))));

        }

        request.setAttribute("listagem", facade.findAll());

        request.getRequestDispatcher(pagDestino).
                forward(request, response);

    }
}
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
