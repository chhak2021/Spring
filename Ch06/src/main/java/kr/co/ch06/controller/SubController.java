package kr.co.ch06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubController {

	@GetMapping("/sub/include")
	public String include() {
		return "/sub/include";
	}
	
	@GetMapping("/sub/layout")
	public String layout() {
		return "/sub/layout";
	}
}
