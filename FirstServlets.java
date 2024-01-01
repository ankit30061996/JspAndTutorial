
package com.servlets;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlets implements Servlet{

     ServletConfig conf;
   
    @Override
    public void init(ServletConfig conf) {
        this.conf=conf;
      System.out.println("Creating Object");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Servicing");
        // set the content type of response
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h1>This is my first Servlet Program using servlet methods ");
    }

     @Override
    public void destroy() {
      System.out.println("System is going to destroy servlet object");
    }
    
     @Override
    public ServletConfig getServletConfig() {
   return this.conf; 
    }
    
    @Override
    public String getServletInfo() {
       return "This servlet is created by Ankit";
    }   
}
