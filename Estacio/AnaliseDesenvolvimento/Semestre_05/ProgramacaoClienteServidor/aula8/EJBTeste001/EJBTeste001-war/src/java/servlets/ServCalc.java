/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;


import ejbs.CalculadoraLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.EJB;

/**
 *
 * @author brunocs
 */
@WebServlet(name = "ServCalc", urlPatterns = {"/ServCalc"})
public class ServCalc extends HttpServlet {
    @EJB
    CalculadoraLocal calculadora;
    
    @Override
    protected  void doPost(HttpServletRequest request, 
            HttpServletResponse response)
        throws ServletException, IOException{response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            int a = new Integer(request.getParameter("A"));
            int b = new Integer(request.getParameter("B"));
            out.println("<!DOCTYPE html>");
            out.println("<html><body>");
            out.println("Soma: " + calculadora.somar(a, b));
            out.println("Subtração: " + calculadora.subtrair(a, b));
            out.println("</body></html>");
        }
    }
}
