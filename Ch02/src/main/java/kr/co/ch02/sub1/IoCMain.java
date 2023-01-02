package kr.co.ch02.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2023/01/02
 * 이름 : 김철학
 * 내용 : 스프링 IoC 실습하기
 */
public class IoCMain {

	public static void main(String[] args) {
		
		// IoC를 활용하지 않은 객체생성
		LgTV tv1 = new LgTV();
		SamsungTV tv2 = new SamsungTV();
		
		tv1.powerOn();
		//tv1.soundUp();
		
		tv2.powerOff();
		//tv2.soundDown();
		
		// 스프링 컨테이너로 객체 주입
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		LgTV      ltv = ctx.getBean("ltv", LgTV.class);
		SamsungTV stv = ctx.getBean("stv", SamsungTV.class);
		
		ltv.powerOn();
		ltv.soundUp();
		
		stv.powerOff();
		stv.soundDown();
		
	}
	
}
