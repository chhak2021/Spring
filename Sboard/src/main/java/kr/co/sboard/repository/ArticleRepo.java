package kr.co.sboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.sboard.entity.ArticleEntity;

public interface ArticleRepo extends JpaRepository<ArticleEntity, Integer> {

}
