package com.ty;

import org.springframework.context.ApplicationContextException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(MyConf.class);
		
		Student student=(Student)context.getBean("student");
		
		Student student1=(Student)context.getBean("student");
		
		System.out.println(student);

		System.out.println(student1);
	}
}
