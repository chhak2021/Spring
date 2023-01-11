package kr.co.ch07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.JpaEntityMetadata;
import org.springframework.stereotype.Repository;

import kr.co.ch07.vo.User1VO;

@Repository
public interface User1Repo extends JpaRepository<User1VO, String> {

}
