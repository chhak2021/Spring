package kr.co.ch08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class User2Controller {

	@GetMapping("/user2/login")
	public String login() {
		return "/user2/login";
	}

	@GetMapping("/user2/loginSuccess")
	public String loginSuccess() {
		return "/user2/loginSuccess";
	}
	
}
