
package com.servlets;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlets extends GenericServlet{
    
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Created servlet by using GenericServlet");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h1>This is the servlet program i created using generic servlet</h1>");
    }   
}
