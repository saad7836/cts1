package com.cts.spring.springiocapp2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionTest {
	public static void main(String[] args) {
		 BeanFactory beanfactory = new ClassPathXmlApplicationContext(
			        "context.xml");
	     SetterInjection bean = (SetterInjection) beanfactory.getBean("been_message");
		 String msg = bean.getMessage();
		 System.out.println(msg);
	}

}
