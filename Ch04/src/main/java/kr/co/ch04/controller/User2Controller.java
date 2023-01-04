package kr.co.ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch04.vo.User2VO;

@Controller
public class User2Controller {

	@GetMapping("/user2/register")
	public String register() {
		return "/user2/register";
	}
	
	@PostMapping("/user2/register")
	public String register(Model model, User2VO vo) {
		model.addAttribute(vo);
		return "/user2/result";
	}
	
}
