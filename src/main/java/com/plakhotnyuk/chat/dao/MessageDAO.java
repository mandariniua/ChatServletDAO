package com.plakhotnyuk.chat.dao;

import java.util.List;

import com.plakhotnyuk.chat.bean.Message;

public interface MessageDAO {
	
	public void writeMessage(Message message);
	public List<Message> viewAllMessage();

	
}
