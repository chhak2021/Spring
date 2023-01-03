package kr.co.ch03.sub2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdviceAfter {

	@Pointcut("execution(* kr.co.ch03..AOPService.insert*(..))")
	public void pointcut1() {}
	
	@Pointcut("execution(* kr.co.ch03..AOPService.select*(..))")
	public void pointcut2() {}
	
	@Pointcut("execution(* kr.co.ch03..AOPService.update*(..))")
	public void pointcut3() {}
	
	@After("pointcut1()")
	public void after1() {
		System.out.println("횡단관심 - after1...");
	}
	
	@After("pointcut2()")
	public void after2() {
		System.out.println("횡단관심 - after2...");
	}
	
	@After("pointcut3()")
	public void after3() {
		System.out.println("횡단관심 - after3...");
	}
}
