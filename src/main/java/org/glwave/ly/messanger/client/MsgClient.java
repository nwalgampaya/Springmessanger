package org.glwave.ly.messanger.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glwave.ly.messanger.model.Message;

public class MsgClient {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();

		WebTarget target = client.target("http://localhost:8080/Springmessanger/webapi/messages/msg");

		Invocation.Builder invocation = target.request(MediaType.APPLICATION_XML);
		Response response = invocation.get();

		Message message = response.readEntity(Message.class);
		// List<Message> listOfEmployees = message.getMessage();

		System.out.println("**************In Service********" + message.getAuthor());

	}
}
