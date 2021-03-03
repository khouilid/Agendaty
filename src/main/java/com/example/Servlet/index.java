package com.example.Servlet;

import com.example.Model.UsersEntity;
import com.example.Repository.Login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

        HttpSession session = request.getSession();
        String url = "inde.jsp";
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");

        System.out.println(email);
        UsersEntity user = (UsersEntity) request.getSession().getAttribute("user");

        if (user != null) {
            request.getRequestDispatcher("WEB-INF/Views/" + user.getType() + ".jsp").forward(request, response);
        }

        user = Login.loginUser(email, pwd);
        if (user != null) {
            session.setAttribute("user", user);
            url = "WEB-INF/Views/" + user.getType() + ".jsp";
        }
        request.getRequestDispatcher(url).forward(request, response);
    }
}
