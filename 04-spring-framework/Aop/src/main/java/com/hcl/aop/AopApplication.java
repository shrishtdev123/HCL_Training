package com.hcl.aop;
import  com.hcl.aop.modal.User;

import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;





@SpringBootApplication

public class AopApplication {

	 

	public static void main(String[] args) 
	{
	ConfigurableApplicationContext	context=SpringApplication.run(AopApplication.class, args);
	
	      
	          User user=(User)((BeanFactory) context).getBean(User.class);
	          
	            user.setId(2L);
	            user.setName("dev");
	            Map<String,String> map=new HashMap<>();
	            
	             map.put("city", "Noida");
	             map.put("clg", "gniot");
	            
	             user.setAddress(map);
	             System.out.println(user);
	             
	           
	          
	}

}
