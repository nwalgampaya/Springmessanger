package org.glwave.ly.messanger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.glwave.ly.messanger.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	@Autowired
	List<Message> messages;

//	List<Message>
	public List<Message> getAllMessages(){
		
		System.out.println("**************In Service********");
//		List<Message> messages = new ArrayList<>();
 		Message m1 = new Message(1l,"Nalin ",new Date(), "Me");
		Message m2 = new Message(2l,"JSOn ",new Date(), "Me");
		messages.add(m1);
		messages.add(m2);
		
		messages.forEach(item -> System.out.println("######" +item.toString()));
		return messages;
	}
}
