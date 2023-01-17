package kr.co.ch10.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.ch10.vo.User1VO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class User1DAOTest {

	@Autowired
	private User1DAO dao;
	
	public void insert() {
		User1VO user = new User1VO();
		user.setUid("a101");
		user.setName("홍길동");
		user.setHp("010-1020-1020");
		user.setAge(31);
		dao.insertUser1(user);
	}
	
	@Test
	public void select() {
		User1VO user = dao.selectUser1("AKASK");
		log.info(user.toString());
	}
	
	
}
