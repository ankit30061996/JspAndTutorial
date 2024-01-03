
package com.youtube;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            
          Cookie[] cookies=request.getCookies();
            boolean f = false;
            String name = "";
            
            if(cookies==null){
            out.println("<h1>You are new user to go to home page and submit your name ");
            return;
            }
            else{
            for(Cookie c:cookies)
            {      
              String tname=c.getName();
              if(tname.equals("user_name")){
              f=true;
              name=c.getValue();
              }
            }
            }
           
            if(f){
            out.println("<h1>Hello , " + name + " Welcome to Servlet 2....</h1>");
            out.println("<h1>Thank You</a></h1>");
            }
            else{
            out.println("<h1>You are new user to go to home page and submit your name </h1>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
