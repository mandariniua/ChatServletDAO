package com.plakhotnyuk.chat.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.plakhotnyuk.chat.bean.Users;

public class UsersDAOImplements implements UsersDAO {

	public void addUsers(Users users) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");
				PreparedStatement ps = connection.prepareStatement(
						"INSERT INTO chatUsers(user_name, user_pass)VALUES (?,?);")) {
			ps.setString(1, users.getUserName());
			ps.setString(2, users.getUserPass());
			
			ps.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

		

	@Override
	public Users loginUsers(String userName, String userPass) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1234");
				Statement s = connection.createStatement();) {
			ResultSet rs = s.executeQuery("SELECT * FROM chatUsers;");
			while(rs.next()) {
				if(userName.equals(userName)) {
					if(userPass.equals(userPass)) {
						
					}
				}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Users();
	}


}
