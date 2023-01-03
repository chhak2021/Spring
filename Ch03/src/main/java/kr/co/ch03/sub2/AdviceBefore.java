package kr.co.ch03.sub2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdviceBefore {

	@Pointcut("execution(* kr.co.ch03..AOPService.insert*(..))")
	public void pointcut1() {}
	
	@Pointcut("execution(* kr.co.ch03..AOPService.select*(..))")
	public void pointcut2() {}
	
	@Pointcut("execution(* kr.co.ch03..AOPService.update*(..))")
	public void pointcut3() {}
	
	
	@Before("pointcut1()")
	public void before1() {
		System.out.println("횡단관심 - before1...");
	}
	
	@Before("pointcut2()")
	public void before2() {
		System.out.println("횡단관심 - before2...");
	}
	
	@Before("pointcut3()")
	public void before3() {
		System.out.println("횡단관심 - before3...");
	}
}
