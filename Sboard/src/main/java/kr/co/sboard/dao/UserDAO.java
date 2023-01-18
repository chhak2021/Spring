package kr.co.sboard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.TermsVO;
import kr.co.sboard.vo.UserVO;

@Mapper
@Repository
public interface UserDAO {

	public int insertUser(UserVO vo);
	public UserVO selectUser(String uid);
	public List<UserVO> selectUsers();
	public TermsVO selectTerms();
	public int updateUser(UserVO vo);
	public int deleteUser(String uid);
	
}
