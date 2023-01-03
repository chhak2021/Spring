package kr.co.ch03.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2023/01/03
 * 이름 : 김철학
 * 내용 : 스프링 AOP 실습하기
 * 
 * 스프링 AOP(Aspect Oriented Programming)
 *  - AOP는 관점지향 프로그래밍으로 OOP로 독립적으로 분리하기 어려운 부가로직을 모듈화하는 기법
 *  - 핵심관심과 전체에 적용되는 공통관심을 분리해서 프로그래밍하는 방식
 * 
 * 주요용어
 *  1) 조인포인트(JoinPoint)
 *   - 실행하는 모든 핵심관심 메서드
 * 
 *  2) 포인트컷(PointCut)
 *   - 조인포인트 가운데 실행(AOP가 설정)되는 핵심관심 메서드 
 *  
 *  3) 어드바이스(Advice)
 *   - 횡단관심에 해당하는 공통의 부가기능 메서드
 *   
 *  4) 애스펙트(Aspect)
 *   - 포인트컷과 어드바이스의 결합된 모듈형태
 *   
 *  5) 위빙(Weaving)
 *   - 포인트컷(핵심관심)이 실행될때 어드바이스가 포인트컷에 결합되는 과정
 */
public class AOPMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		Service service = (Service) ctx.getBean("service");
		
		System.out.println("---------------------");
		service.insert();
		
		System.out.println("---------------------");
		service.select();
		
		System.out.println("---------------------");
		service.update();
		
		System.out.println("---------------------");
		service.delete();
	}
}
