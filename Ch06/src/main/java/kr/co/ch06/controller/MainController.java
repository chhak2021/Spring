package kr.co.ch06.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch06.vo.UserVO;

@Controller
public class MainController {

	
	@GetMapping(value = {"/", "/index"})	
	public String index(Model model) {
		
		String tit1 = "스프링부트";
		String tit2 = "타임리프";
		
		UserVO user1 = new UserVO();
		user1.setUid("a101");
		user1.setName("홍길동");
		user1.setHp("010-1234-1001");
		user1.setAge(21);
		
		UserVO user2 = null;
		
		List<UserVO> users = new ArrayList<>();
		users.add(new UserVO("a101", "김유신", "010-1234-1001", 21));
		users.add(new UserVO("a102", "김춘추", "010-1234-1002", 22));
		users.add(new UserVO("a103", "장보고", "010-1234-1003", 23));
		users.add(new UserVO("a104", "강감찬", "010-1234-1004", 24));
		users.add(new UserVO("a105", "이순신", "010-1234-1005", 25));
		
		
		model.addAttribute("tit1", tit1);
		model.addAttribute("tit2", tit2);
		model.addAttribute("user1", user1);
		model.addAttribute("user2", user2);
		model.addAttribute("users", users);
		
		return "/index";
	}
	
	@GetMapping("/hello")
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
	
	
	
}
