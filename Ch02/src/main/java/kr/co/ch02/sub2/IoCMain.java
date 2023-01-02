package kr.co.ch02.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class IoCMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		Computer com = ctx.getBean("com", Computer.class);
		com.show();
	}
}
