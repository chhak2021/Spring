package kr.co.ch08.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch08.repository.User1Repo;
import kr.co.ch08.repository.User2Repo;
import kr.co.ch08.vo.User1VO;
import kr.co.ch08.vo.User2VO;

@Service
public class User2Service {

	@Autowired
	private User2Repo repo;
	
	public User2VO selectUser2(String uid, String pass) {
		return repo.findUser2VOByUidAndPass(uid, pass);
	}
	
}
