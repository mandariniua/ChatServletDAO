package com.plakhotnyuk;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;

import com.plakhotnyuk.chat.bean.Message;
import com.plakhotnyuk.chat.dao.MessageDAO;
import com.plakhotnyuk.chat.dao.MessageDAOImplements;
import com.plakhotnyuk.chat.dao.UsersDAO;
import com.plakhotnyuk.chat.dao.UsersDAOImplements;

public class Main {

	public static void main(String[] args) {

		MessageDAO mess = new MessageDAOImplements();
		mess.viewAllMessage();
	}

}
