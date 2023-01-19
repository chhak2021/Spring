package kr.co.sboard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.ArticleVO;
import kr.co.sboard.vo.FileVO;

@Mapper
@Repository
public interface ArticleDAO {
	public int insertArticle(ArticleVO vo);
	public int insertFile(FileVO vo);
	public ArticleVO selectArticle(int no);
	public List<ArticleVO> selectArticles();
	public int updateArticle(ArticleVO vo);
	public int deleteArticle(int no);
}
