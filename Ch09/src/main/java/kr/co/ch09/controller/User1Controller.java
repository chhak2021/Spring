package kr.co.ch09.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.ch09.service.User1Service;
import kr.co.ch09.vo.User1VO;

@Controller
public class User1Controller {

	@Autowired
	private User1Service service;
	
	@ResponseBody
	@GetMapping("/user1")
	public List<User1VO> list1() {
		List<User1VO> users = service.selectUser1s();
		return users;
	}
	
	@ResponseBody
	@GetMapping("/user1/{id}")
	public User1VO list2(@PathVariable("id") String uid) {
		return service.selectUser1(uid);
	}
	
	@ResponseBody
	@PostMapping("/user1")
	public Map<String, Integer> register(User1VO vo) {		
		service.insertUser1(vo);
		
		Map<String, Integer> resultMap = new HashMap<>();
		resultMap.put("result", 1);
		
		return resultMap;
	}
	
	@ResponseBody
	@PutMapping("/user1")
	public Map<String, Integer> modify(User1VO vo) {
		
		service.updateUser1(vo);
		
		Map<String, Integer> resultMap = new HashMap<>();
		resultMap.put("result", 1);
		
		return resultMap;
	}
	
	@ResponseBody
	@DeleteMapping("/user1/{id}")
	public Map<String, Integer> delete(@PathVariable("id") String uid) {
		service.deleteUser1(uid);
		Map<String, Integer> resultMap = new HashMap<>();
		resultMap.put("result", 1);
		
		return resultMap;
	}
	
}
