package kr.co.ch07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch07.repository.User1Repo;
import kr.co.ch07.vo.User1VO;

@Controller
public class MainController {

	@Autowired
	private User1Repo repo;
	
	@GetMapping(value = {"/", "/index"})
	public String index() {
		return "/index";
	}
	
	@GetMapping("/query1")
	public String query1() {
		User1VO vo = repo.findUser1VOByUid("a102");
		System.out.println("query1 결과 : " + vo);
		return "redirect:/";
	}
	
	@GetMapping("/query2")
	public String query2() {
		List<User1VO> users = repo.findUser1VOByName("장보고");
		System.out.println("query2 결과 : " + users);
		return "redirect:/";
	}
	
	
	
}
