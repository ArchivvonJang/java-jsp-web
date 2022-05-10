package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardInsert extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		//다음 이동할 경로로 반환
		return new ModelAndView("/WEB-INF/board/insert.jsp");
	}

}
