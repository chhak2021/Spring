package kr.co.ch10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class SubController {

	@GetMapping("/sub/hello")
	public String hello() {
		
		log.debug("hello log debug...");
		log.info("hello log info...");
		log.warn("hello log warn...");
		log.error("hello log error...");
		
		return "/sub/hello";
	}
	
	@GetMapping("/sub/welcome")
	public String welcome() {
		
		log.debug("welcome log debug...");
		log.info("welcome log info...");
		log.warn("welcome log warn...");
		log.error("welcome log error...");
		
		return "/sub/welcome";
	}
	
	@GetMapping("/sub/greeting")
	public String greeting() {
		
		log.debug("greeting log debug...");
		log.info("greeting log info...");
		log.warn("greeting log warn...");
		log.error("greeting log error...");
		
		return "/sub/greeting";
	}
	
}
