package kr.co.ch05.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.User1VO;

@Repository
public class User1DAO {

	@Autowired
	private 마이바티스클래스타입 마이바이티객체;
	
	public void insertUser1(User1VO vo) {
		마이바이티객체.insert(vo);
	}
	
	public User1VO selectUser1(String uid) {
		return null;
	}
	public List<User1VO> selectUser1s() {
		return null;
	}
	public void updateUser1(User1VO vo) {
		
	}
	public void deleteUser1(String uid) {
		
	}
	
}
