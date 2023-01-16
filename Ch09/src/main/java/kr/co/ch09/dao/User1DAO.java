package kr.co.ch09.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.ch09.vo.User1VO;

@Mapper
@Repository
public interface User1DAO {
	public int insertUser1(User1VO vo);
	public User1VO selectUser1(String uid);
	public List<User1VO> selectUser1s();
	public int updateUser1(User1VO vo);
	public int deleteUser1(String uid);
}
