package kr.co.ch08.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ch08.vo.User1VO;
import kr.co.ch08.vo.User2VO;

public interface User2Repo extends JpaRepository<User2VO, String> {

	public User2VO findUser2VOByUidAndPass(String uid, String pass);
	
}
