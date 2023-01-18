package kr.co.sboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("user/login")
	public String login() {
		return "user/login";
	}
	
	@GetMapping("user/register")
	public String register() {
		return "user/register";
	}
	
	@GetMapping("user/terms")
	public String terms() {
		return "user/terms";
	}
}
