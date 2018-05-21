package org.glwave.ly.messanger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glwave.ly.messanger.model.Message;
import org.glwave.ly.messanger.service.MessageService;

@Path("messages")
public class MessageResources {

	MessageService messageService = new MessageService();
	
	@GET
	@Path("/msg")
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}

	/*@GET
	@Path("/msg")
	@Produces(MediaType.APPLICATION_XML)*/
//		public Message getMessages() {
//		return "orking ithout";
//		return messageService.getAllMessages();
//	}
}
