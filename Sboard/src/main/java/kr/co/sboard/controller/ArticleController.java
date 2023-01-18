package kr.co.sboard.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sboard.security.MyUserDetails;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ArticleController {

	@GetMapping("list")
	public String list(Principal principal) {
		//MyUserDetails myUser = (MyUserDetails) principal;
		//log.info("myUser : " + myUser.getUser().getName());
		
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
