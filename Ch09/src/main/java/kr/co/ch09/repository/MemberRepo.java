package kr.co.ch09.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ch09.vo.MemberVO;

public interface MemberRepo extends JpaRepository<MemberVO, String> {

	
	
}
