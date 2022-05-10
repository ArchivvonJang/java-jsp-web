package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDao;
import board.model.BoardDto;

public class BoardView extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		//글번호 받기
		Long no = Long.parseLong(request.getParameter("no"));
		//Singleton
		BoardDao boardDao = BoardDao.getInstance();
		
		//조회수 처리도 같이 
		if(boardDao.updateReadcount(no)) {
			
			//해당 번호의 레코드 정보를 Dto에 담아서 
			BoardDto boardDto = boardDao.getBoardView(no);
			//이걸 mav에 담아서 상세보기 페이지로 넘긴다. view경로로, key라는 이름으로, value를 보낸다.
			return new ModelAndView("/WEB-INF/board/content.jsp","boardDto", boardDto);
		
		}else {
			ModelAndView mav = new ModelAndView("WEB-INF/board/result.jsp");
			mav.addObject("msg", no+"번 게시물이 존재하지 않습니다.");
			mav.addObject("url", "BoardList.do");
			return mav;
		}
		
		

	}
	
}
