package com.plakhotnyuk.chat.bean;

import java.sql.Date;

public class Message {
	private String messageText;
	private long date;
	
	public Message() {
		
	}
	public Message(String message) {
		this.messageText=message;
		
	}

	public Message(String message, long date) {
		this.messageText = message;
		this.date = date;
	}

	public String getMessage() {
		return messageText;
	}

	public void setMessage(String message) {
		this.messageText = message;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}
	
	
	
	

}
