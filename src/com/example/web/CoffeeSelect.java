package com.example.web;
import com.example.model.CoffeeExpert;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;


public class CoffeeSelect extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    String c = request.getParameter("color");
    //out.println("<br>Got coffee color " + c );
    CoffeeExpert barista = new CoffeeExpert();
    List result = barista.getBrands(c);
    // response.setContentType("text/html");
    // PrintWriter out = response.getWriter();
    // out.println("Coffee Selection Advice <br>");
    request.setAttribute("styles", result);
    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response);

  }
}
