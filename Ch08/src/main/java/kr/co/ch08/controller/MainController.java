package kr.co.ch08.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch08.vo.User2VO;

@Controller
public class MainController {
	
	@GetMapping(value = {"/", "/index"})
	public String index(@AuthenticationPrincipal User2VO user) {
		
		if(user != null) {
			System.out.println("name : "+ user.getName());	
		}else {
			System.out.println("here1");
		}
		
		
		return "/index";
	}

	@GetMapping("/admin/success")
	public String adminSuccess() {
		return "/admin/success";
	}
	
	@GetMapping("/member/success")
	public String memberSuccess() {
		return "/member/success";
	}
	
	@GetMapping("/guest/success")
	public String guestSuccess() {
		return "/guest/success";
	}
}
