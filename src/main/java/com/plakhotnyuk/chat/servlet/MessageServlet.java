package com.plakhotnyuk.chat.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.plakhotnyuk.chat.bean.Message;
import com.plakhotnyuk.chat.bean.Users;
import com.plakhotnyuk.chat.dao.MessageDAO;
import com.plakhotnyuk.chat.dao.MessageDAOImplements;


public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MessageDAOImplements md = new MessageDAOImplements();
		request.setAttribute("messageList", md.viewAllMessage());
		
		RequestDispatcher rd = request.getRequestDispatcher("/chat.jsp");
		rd.forward(request, response);
		doPost(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Message message = new Message();
		
		message.setMessage(request.getParameter("message"));
		
		MessageDAO md = new MessageDAOImplements();
		
		md.writeMessage(message);

		doGet(request, response);
	}

}
