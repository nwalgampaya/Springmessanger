package org.glwave.ly.messanger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages= {"org.glwave.ly.messanger","org.glwave.ly.messanger.service"})
public class MyApplicationContext {

	/*@Bean(name = "message")
	public void setMessage() {
		
	}*/
/*	@Bean("employeeManager")
	public EmployeeManager employeeManager() {
        return new EmployeeManagerImpl();
    }*/
	
/*	@Bean("employeeService")
	public EmployeeService employeeService() {
        return new EmployeeService();
    }*/
}
