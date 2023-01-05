package kr.co.ch05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch05.service.User1Service;
import kr.co.ch05.vo.User1VO;

@Controller
public class User1Controller {
	
	@Autowired
	private User1Service service;

	@GetMapping("/user1/list")
	public String list(Model model) {
		List<User1VO> users = service.selectUser1s();
		model.addAttribute("users", users);
		return "/user1/list";
	}
	
	@GetMapping("/user1/register")
	public String register() {
		return "/user1/register";
	}
	
	@PostMapping("/user1/register")
	public String register(User1VO vo) {
		service.insertUser1(vo);
		return "redirect:/user1/list";
	}
}
