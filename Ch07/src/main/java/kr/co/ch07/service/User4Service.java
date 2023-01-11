package kr.co.ch07.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch07.repository.User4Repo;
import kr.co.ch07.vo.User4VO;

@Service
public class User4Service {
	
	@Autowired
	private User4Repo repo;

	public void insertUser4(User4VO vo) {
		// JPA
		repo.save(vo);		
	}
	
	
}
