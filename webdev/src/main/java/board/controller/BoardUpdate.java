package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDao;
import board.model.BoardDto;

public class BoardUpdate extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		//글번호 받기
		Long no = Long.parseLong(request.getParameter("no"));
		//Singleton
		BoardDao boardDao = BoardDao.getInstance();
		//수정폼에 뿌려줄 정보
		BoardDto boardDto = boardDao.getBoardView(no);
		
		return new ModelAndView("/WEB-INF/board/update.jsp", "boardDto", boardDto);
	}

}
