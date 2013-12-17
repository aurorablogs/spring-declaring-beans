package com.aurora.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aurora.spring.beans.Writer;

/**
 * 
 * @author khobab
 *
 */
public class Main {
	
	public static void main(String[] args) {
		// get context definition
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aurora/spring/application-context.xml");
		Writer writer; 
		
		// get english writer bean and execute
		writer = (Writer) ctx.getBean("english");
		writer.write();
		
		// get spanish writer bean and execute
		writer = (Writer) ctx.getBean("spanish");
		writer.write();
	}
}