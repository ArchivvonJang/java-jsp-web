package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDao;
import board.model.BoardDto;

public class BoardDelete extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		//글번호 받기
		Long no = Long.parseLong(request.getParameter("no"));

		//삭제는 다른 정보없이 번호만 넘기면 된다.
		return new ModelAndView("/WEB-INF/board/delete.jsp", "no", no);
	}

}
