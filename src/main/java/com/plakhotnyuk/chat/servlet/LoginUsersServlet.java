package com.plakhotnyuk.chat.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.plakhotnyuk.chat.bean.Users;
import com.plakhotnyuk.chat.dao.UsersDAO;
import com.plakhotnyuk.chat.dao.UsersDAOImplements;


public class LoginUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("chat.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Users users = new UsersDAOImplements().loginUsers(String.valueOf(request.getParameter("userName")),String.valueOf(request.getParameter("userPass")));
			request.setAttribute("users", users);
			RequestDispatcher rd = request.getRequestDispatcher("chat.jsp");
			rd.forward(request, response);
			response.getWriter().write("ok");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
