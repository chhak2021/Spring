package kr.co.ch08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping(value = {"/", "/index"})
	public String index() {
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
