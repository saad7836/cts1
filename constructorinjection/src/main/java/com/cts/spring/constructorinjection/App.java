package com.cts.spring.constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BeanFactory beanfactory = new ClassPathXmlApplicationContext(
		        "context.xml");
		ConstructorInjection bean = (ConstructorInjection) beanfactory.getBean("basic");
		System.out.println(bean.getMessage());
    }
}
