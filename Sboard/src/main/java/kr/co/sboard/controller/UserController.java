package kr.co.sboard.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sboard.service.UserService;
import kr.co.sboard.vo.TermsVO;
import kr.co.sboard.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
	
	@PostMapping("user/register")
	public String register(UserVO vo, HttpServletRequest req) {
		
		vo.setRegip(req.getRemoteAddr());
		int result = service.insertUser(vo);
		
		return "redirect:/user/login?success="+result;
	}
	
	@GetMapping("user/terms")
	public String terms(Model model) {
		TermsVO vo = service.selectTerms();
		model.addAttribute(vo);		
		return "user/terms";
	}
	
	@ResponseBody
	@GetMapping("user/checkUid")
	public Map<String, Integer> checkUid(@RequestParam("uid") String uid) {
		
		log.info("uid : " + uid);
		int result = service.countByUid(uid);
		
		Map<String, Integer> resultMap = new HashMap<>();
		resultMap.put("result", result);
		
		return resultMap;
	}
	
}

















