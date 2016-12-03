package com.plakhotnyuk.chat.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.plakhotnyuk.chat.bean.Message;

public class MessageDAOImplements implements MessageDAO {

	@Override
	public void writeMessage(Message message) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");
				PreparedStatement ps = connection.prepareStatement(
						"INSERT INTO chatMess (message) VALUES (?);")) {
			ps.setString(1, message.getMessage());
			
			ps.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Message> viewAllMessage() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		ArrayList<Message> messageList = new ArrayList<>();
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");
				Statement statement = connection.createStatement();) {
			ResultSet rs = statement.executeQuery("SELECT message FROM chatMess;");
			
			while (rs.next()) {
				String message = rs.getString("message");
				messageList.add(new Message(message));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return messageList;
	}


	

}
