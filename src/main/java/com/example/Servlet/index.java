package com.example.Servlet;

import com.example.Model.UsersEntity;
import com.example.Repository.Login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "index", value = "/")
public class index extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("inde.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String url = "inde.jsp";
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");

        UsersEntity user = Login.loginUser(email, pwd);
        if (user != null) {
            request.getSession().setAttribute("user", user);
            url = "WEB-INF/Views/"+ user.getType() +".jsp";
        } else {
        }
        request.getRequestDispatcher(url).forward(request, response);
    }
}
