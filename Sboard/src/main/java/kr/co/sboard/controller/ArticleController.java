package kr.co.sboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

	@GetMapping("list")
	public String list() {
		return "list";
	}
	
	@GetMapping("modify")
	public String modify() {
		return "modify";
	}
	
	@GetMapping("view")
	public String view() {
		return "view";
	}
	
	@GetMapping("write")
	public String write() {
		return "write";
	}
}
