package kr.co.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.user.vo.User1VO;

@Mapper
@Repository
public interface User1DAO {
	public void insertUser1(User1VO vo);
	public User1VO selectUser1(String uid);
	public List<User1VO> selectUser1s();
	public void updateUser1(User1VO vo);
	public void deleteUser1(String uid);
}

