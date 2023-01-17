package kr.co.ch10.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = MainController.class)
public class MainControllerTest {

	@Autowired
	private MockMvc mvc; // mvc 테스트를 위한 가상 mvc
	
	@Test
	public void index() throws Exception {
		mvc.perform(get("/index"))  	  // index 요청 테스트
		.andExpect(status().isOk()) 	  // HTTP 요청 상태 테스트
		.andExpect(view().name("/index")) // 
		.andDo(print());				  // 요청 테스트 결과 출력
	}
	
	
}
