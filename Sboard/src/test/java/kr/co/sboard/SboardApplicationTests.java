package kr.co.sboard;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.sboard.dao.UserDAO;
import kr.co.sboard.service.UserService;
import kr.co.sboard.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class SboardApplicationTests {

	
	void contextLoads() {
	}
	
	
	@Autowired
	private UserDAO dao;
	
	@Autowired
	private UserService service;
	
	
	@Test
	public void insertTest() {
		
		UserVO vo = UserVO.builder()
					.uid("test2")
					.pass1("1234")
					.name("테스트")
					.nick("테스트2")
					.email("test2@naver.com")
					.hp("010-1121-7772")
					.regip("0:0:0:0:0:0:0:1")
					.build();
		
		int result = service.insertUser(vo);
		
		log.info("result : " + result);
		
	}
	
	
	

}
