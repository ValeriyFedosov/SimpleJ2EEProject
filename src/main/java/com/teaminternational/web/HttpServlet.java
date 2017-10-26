package com.teaminternational.web;


import com.teaminternational.HelloWorldGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.awt.Color.white;

public class HttpServlet extends BaseHttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HelloWorldGenerator asd = getBean(HelloWorldGenerator.COMPONENT_NAME);
        asd.sayHello();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
        out.println(asd.sayHello());
        out.println("</body>");
        out.println("</html>");




          }

}
