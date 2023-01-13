package kr.co.ch08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch08.service.User2Service;
import kr.co.ch08.vo.User2VO;

@Controller
public class User2Controller {

	@Autowired
	private User2Service service;
	
	@GetMapping("/user2/login")
	public String login() {
		return "/user2/login";
	}

	@GetMapping("/user2/loginSuccess")
	public String loginSuccess() {
		return "/user2/loginSuccess";
	}
	
	@GetMapping("/user2/register")
	public void register() {}
	
	@PostMapping("/user2/register")
	public String register(User2VO vo) {
		service.insertUser(vo);
		return "redirect:/user2/login";
	}
}
