package com.hcl.SpringDi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.setter.Address;
import com.hcl.setter.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	String beanLocation="/com/hcl/config/test.xml";
        
    	
    	/*
    	 *  we have two type of spring container
    	 *  1.BeanFactory(Parent interface)
    	 *  2.ApplicationContext(Child interface)*
    	 *  
    	 * _context_________________
    	 *   dev
    	 *  
    	 * __________________
    	 */
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext(beanLocation);
    	 
    	 Address a=(Address) context.getBean("dev");//new Address();
//          a.setAddressLine1("Noida");
//          a.setCity("greater noida");
//          a.setCountry("india");
//          a.setState("up");
    	 Employee b=(Employee) context.getBean("dev12");
    	 
          
          System.out.println(b);
          
    }
}



