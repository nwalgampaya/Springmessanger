package org.glwave.ly.messanger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glwave.ly.messanger.model.Message;
import org.glwave.ly.messanger.service.MessageService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
/*    MessageService messageService = new MessageService();
	@GET
//	@Path("/msg")
//	List<Message>
	@Produces(MediaType.APPLICATION_JSON)
		public String getMessages() {
		return messageService.getAllMessages();
}*/
	}
