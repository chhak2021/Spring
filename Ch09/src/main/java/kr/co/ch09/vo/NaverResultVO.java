package kr.co.ch09.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NaverResultVO {

	private String lastBuildDate;
	private int total;
	private int start;
	private int display;
	private List<BookVO> items;
	
}
