package board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.model.BoardDao;
import board.model.BoardDto;
import board.model.MemberDto;

public class BoardList extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();

		MemberDto userInfo = (MemberDto) session.getAttribute("userInfo");
		
		//session에 정보가 없는 경우 ( 로그인하기 전, 이미 로그아웃한 경우)
		if(userInfo == null) {
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", "로그인해주세요.");
			mav.addObject("url", "Login.do");
			return mav;
		
		}
		
		String logInfo = userInfo.getName() + "(" + userInfo.getId() + ")님이 로그인하였습니다. ";
		
		BoardDao boardDao = BoardDao.getInstance();
		List<BoardDto> list = boardDao.getBoardList();
		
		ModelAndView mav = new ModelAndView("/WEB-INF/board/list.jsp");
		mav.addObject("logInfo", logInfo);
		return mav;
	}

}
