package com.sjsu.rollbits.dao.interfaces.service;

import java.util.Arrays;
import java.util.List;

import com.sjsu.rollbits.dao.interfaces.MessageDao;
import com.sjsu.rollbits.dao.interfaces.model.Message;

public class MessageService {

	private  MessageDao messageDao;

	public MessageService() {
		messageDao = new MessageDao();
	}

	public  void persist(Message entity) {
		messageDao.openCurrentSessionwithTransaction();
		messageDao.persist(entity);
		messageDao.closeCurrentSessionwithTransaction();
	}

	public  void update(Message entity) {
		messageDao.openCurrentSessionwithTransaction();
		messageDao.update(entity);
		messageDao.closeCurrentSessionwithTransaction();
	}

	public  Message findById(int id) {
		messageDao.openCurrentSession();
		Message message = messageDao.findById(id);
		messageDao.closeCurrentSession();
		return message;
	}

	public  void delete(int id) {
		messageDao.openCurrentSessionwithTransaction();
		Message message = messageDao.findById(id);
		messageDao.delete(message);
		messageDao.closeCurrentSessionwithTransaction();
	}

	public  List<Message> findAll() {
		messageDao.openCurrentSession();
		List<Message> messages = messageDao.findAll();
		messageDao.closeCurrentSession();
		return messages;
	}

	public  List<Message> findAllforuname(String uname) {
		messageDao.openCurrentSession();
		List<Message> messages = messageDao.findAllForUname(uname);
		messageDao.closeCurrentSession();
		return messages;
	}

	public  List<Message> findAllfromuname(String uname) {
		messageDao.openCurrentSession();
		List<Message> messages = messageDao.findAllFromUname(uname);
		messageDao.closeCurrentSession();
		return messages;
	}

	public  List<Message> findAllMessages(String uname, List<String> groups) {
		messageDao.openCurrentSession();
		List<Message> messages = messageDao.findAllMessages(uname, groups);

		messageDao.closeCurrentSession();
		return messages;
	}

	public  List<Message> findByUserName(String uname) {
		messageDao.openCurrentSession();
		List<Message> messages = messageDao.findAllForUname(uname);
		messageDao.closeCurrentSession();
		return messages;
	}

	public  void deleteAll() {
		messageDao.openCurrentSessionwithTransaction();
		messageDao.deleteAll();
		messageDao.closeCurrentSessionwithTransaction();
	}

	public MessageDao MessageDao() {
		return messageDao;

	}

	public  void main(String[] args) throws InterruptedException {

		MessageService ms = new MessageService();
		ms.findAllMessages("abcdefnov20", Arrays.asList(new String[] { "Rollbits-App" }));

		Thread.sleep(10000);

		MessageService ms1 = new MessageService();
		ms.findAllMessages("abcdefnov20", Arrays.asList(new String[] { "Rollbits-App" }));

		MessageService ms2 = new MessageService();
		ms.findAllMessages("abcdefnov20", Arrays.asList(new String[] { "Rollbits-App" }));

		Thread.sleep(10000);

		MessageService ms3 = new MessageService();
		ms.findAllMessages("abcdefnov20", Arrays.asList(new String[] { "Rollbits-App" }));

		Thread.sleep(10000);

		MessageService ms4 = new MessageService();
		ms.findAllMessages("abcdefnov20", Arrays.asList(new String[] { "Rollbits-App" }));

		Thread.sleep(10000);
		ms.findAllMessages("abcdefnov20", Arrays.asList(new String[] { "Rollbits-App" }));

		ms.findAllMessages("abcdefnov20", Arrays.asList(new String[] { "Rollbits-App" }));

		ms.findAllMessages("abcdefnov20", Arrays.asList(new String[] { "Rollbits-App" }));

		ms.findAllMessages("abcdefnov20", Arrays.asList(new String[] { "Rollbits-App" }));

		ms.findAllMessages("abcdefnov20", Arrays.asList(new String[] { "Rollbits-App" }));

		ms.findAllMessages("abcdefnov20", Arrays.asList(new String[] { "Rollbits-App" }));

		ms.findAllMessages("abcdefnov20", Arrays.asList(new String[] { "Rollbits-App" }));

	}

}
