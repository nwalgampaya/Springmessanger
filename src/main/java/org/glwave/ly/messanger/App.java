package org.glwave.ly.messanger;

import java.util.List;

import org.glwave.ly.messanger.model.Message;
import org.glwave.ly.messanger.service.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
	/*public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	output.generateOutput();
	}*/
	
	    public static void main( String[] args )
	    {
	        //Method 1
	        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	        ctx.register(MyApplicationContext.class);
	        ctx.refresh();
	         
//	        EmployeeManager empManager = (EmployeeManager)ctx.getBean("employeeManager");
/*	        EmployeeManager empManager = (EmployeeManager)ctx.getBean(EmployeeManager.class);
	        
	        Employee emp = empManager.create();
	  */      
	        MessageService msgService= (MessageService)ctx.getBean(MessageService.class);
	        List<Message> msg = msgService.getAllMessages();
	        
	        System.out.println(msg);
	    }
	
	 
	
}