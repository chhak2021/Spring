package kr.co.ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "/hello";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "/welcome";
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "/greeting";
	}
	
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:/user1/register";
	}
	
	@GetMapping("/forward")
	public String forward() {
		return "forward:/user2/register";
	}
}
