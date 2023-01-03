package kr.co.ch03.sub2;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdviceAfterReturn {

	@Pointcut("execution(* kr.co.ch03..AOPService.insert*(..))")
	public void pointcut1() {}
	
	@Pointcut("execution(* kr.co.ch03..AOPService.select*(..))")
	public void pointcut2() {}
	
	@Pointcut("execution(* kr.co.ch03..AOPService.update*(..))")
	public void pointcut3() {}
	
	@AfterReturning("pointcut1()")
	public void afterReturn1() {
		System.out.println("횡단관심 - afterReturn1...");
	}
	
	@AfterReturning("pointcut2()")
	public void afterReturn2() {
		System.out.println("횡단관심 - afterReturn2...");
	}
	
	@AfterReturning("pointcut3()")
	public void afterReturn3() {
		System.out.println("횡단관심 - afterReturn3...");
	}
}
