package com.plakhotnyuk.chat.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.plakhotnyuk.chat.bean.Users;
import com.plakhotnyuk.chat.dao.UsersDAO;
import com.plakhotnyuk.chat.dao.UsersDAOImplements;

public class AddUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Users users = new Users();
		
		users.setUserName(request.getParameter("userName"));
		users.setUserPass(request.getParameter("userPass"));
		
		UsersDAO userDao = new UsersDAOImplements();
		
		userDao.addUsers(users);
		response.sendRedirect("chat.jsp");
		
		
	}

}
