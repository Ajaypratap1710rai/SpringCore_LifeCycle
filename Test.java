package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String[] args) {
	 AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/LC_config.xml");
     Apple a=(Apple) context.getBean("a1");
     context.registerShutdownHook();
     System.out.println(a);
     
     System.out.println("---------------------------------");
     Pepsi p=(Pepsi) context.getBean("p1");
     System.out.println(p);
 }
}
