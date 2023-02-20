package kr.co.todo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.todo.vo.TodoVO;

@Mapper
@Repository
public interface MainDAO {
    // create

    /**
     * 2023/02/20 // 김철학 // 투두 리스트 생성
     */
    public int insertTodoList(TodoVO vo);

    // read

    /**
     * 2023/02/20 // 김철학 // 투두 리스트 불라오기
     * @return
     */
    public List<TodoVO> selectTodoList();
    // upload

    /**
     * 2023/02/20 // 김철학 // 투두리스트 업데이트
     *      필요한 값
     *      todoNum
     *      todoStatus
     * @param data
     * @return 결과 값
     */
    public int updateTodoList(Map<String, String> data);
    // delete

    /**
     * 2023/02/20 // 김철학 // 투두리스트 삭제
     */
    public int deleteTodoList(TodoVO vo);

}