package kr.co.ch07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.JpaEntityMetadata;
import org.springframework.stereotype.Repository;

import kr.co.ch07.vo.User1VO;
import kr.co.ch07.vo.User4VO;

public interface User4Repo extends JpaRepository<User4VO, Integer> {

}
