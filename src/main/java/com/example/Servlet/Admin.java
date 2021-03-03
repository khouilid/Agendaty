package com.example.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Admin", value = {"/newteacher", "/newclass", "newstudent"})
public class Admin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        switch (action) {
            case "newteacher":
                System.out.println(1);
                request.getRequestDispatcher("inde.jsp").forward(request, response);
            case "newclass":
                System.out.println(2);
                request.getRequestDispatcher("inde.jsp").forward(request, response);

            case "newstudent":
                System.out.println(3);
                request.getRequestDispatcher("inde.jsp").forward(request, response);


        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doGet(request, response);
    }
//

}
