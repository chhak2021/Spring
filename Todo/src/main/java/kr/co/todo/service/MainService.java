package kr.co.todo.service;

import kr.co.todo.dao.MainDAO;
import kr.co.todo.vo.TodoVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class MainService {

    /**
     * 2023/02/20 // 김철학 // dao 연결
     */
    @Autowired
    private MainDAO dao;

    // create

    /**
     * 2023/02/20 // 김철학 // 투두 리스트 생성
     */
    public int insertTodoList(TodoVO vo) {
         return dao.insertTodoList(vo);
    }

    // read

    /**
     * 2023/02/20 // 김철학 // 투두 리스트 불라오기
     * 리스트 불러온후 상태 값에 따라 분리
     * @return 1, 2, 3
     */
    public Map<Integer, List<TodoVO>> selectTodoList() {
        List<TodoVO> list = dao.selectTodoList();
        return list.stream().collect(Collectors.groupingBy(TodoVO::getStatus));
    }

    // update

    /**
     * 2023/02/20 // 김철학 // 투두리스트 업데이트
     *      필요한 값
     *      todoNum
     *      todoStatus
     * @return 결과 값
     */
    public int updateTodoList(Map<String, String> data) {
        return dao.updateTodoList(data);
    }

    // delete

    /**
     * 2023/02/20 // 김철학 // 투두리스트 삭제
     */
    public int deleteTodoList(TodoVO vo) {
        return dao.deleteTodoList(vo);
    }

    // service
}

