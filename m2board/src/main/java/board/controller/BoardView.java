package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.model.BoardDao;
import board.model.BoardDto;
import board.model.MemberDto;

public class BoardView extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		//session
		HttpSession session = request.getSession();

		MemberDto userInfo = (MemberDto) session.getAttribute("userInfo");
		
		//session에 정보가 없는 경우 ( 로그인하기 전, 이미 로그아웃한 경우)
		if(userInfo == null) {
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", "로그인해주세요.");
			mav.addObject("url", "Login.do");
			return mav;
		
		}
		
		//content
		Long no = Long.parseLong(request.getParameter("no"));
		BoardDao boardDao = BoardDao.getInstance();
		
		//readcount
		if(boardDao.updateReadCount(no)) {
			
			BoardDto boardDto = boardDao.getBoardView(no);		
			boardDto.setContent(boardDto.getContent().replace("\n", "<br/>"));
			
			return new ModelAndView("/WEB-INF/board/content.jsp", "boardDto", boardDto);
		
		}else{
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", no + "번 게시물이 존재하지 않습니다.");
			mav.addObject("url", "BoardList.do");
			return mav;
		}

	}

}
