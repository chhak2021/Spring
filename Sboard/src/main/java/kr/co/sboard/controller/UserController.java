package kr.co.sboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sboard.service.UserService;
import kr.co.sboard.vo.TermsVO;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("user/login")
	public String login() {
		return "user/login";
	}
	
	@GetMapping("user/register")
	public String register() {
		return "user/register";
	}
	
	@GetMapping("user/terms")
	public String terms(Model model) {
		TermsVO vo = service.selectTerms();
		model.addAttribute(vo);		
		return "user/terms";
	}
}
