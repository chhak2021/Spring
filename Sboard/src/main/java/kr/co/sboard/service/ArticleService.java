package kr.co.sboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sboard.dao.ArticleDAO;
import kr.co.sboard.vo.ArticleVO;

@Service
public class ArticleService {

	@Autowired
	private ArticleDAO dao;
	
	public int insertArticle(ArticleVO vo) {
		return dao.insertArticle(vo);
	}
	public ArticleVO selectArticle(int no) {
		return dao.selectArticle(no);
	}
	public List<ArticleVO> selectArticles() {
		return dao.selectArticles();
	}
	public int updateArticle(ArticleVO vo) {
		return dao.updateArticle(vo);
	}
	public int deleteArticle(int no) {
		return dao.deleteArticle(no);
	}
	
}
