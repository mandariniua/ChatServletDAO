package com.plakhotnyuk.chat.dao;

import com.plakhotnyuk.chat.bean.Users;

public interface UsersDAO {
	
	public void addUsers(Users users);
	public Users loginUsers(String userName, String userPass);
	
}
