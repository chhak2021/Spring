package kr.co.ch01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		Hello    bean1 = (Hello) ctx.getBean("hello");
		Welcome  bean2 = (Welcome) ctx.getBean("welcome");
		Greeting bean3 = (Greeting) ctx.getBean("greeting");
		
		bean1.show();
		bean2.show();
		bean3.show();
	}
}
