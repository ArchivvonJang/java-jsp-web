package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.log.UserDataHelper.Mode;

import board.model.BoardDao;
import board.model.BoardDto;
import board.model.MemberDto;

public class BoardInsertAction extends AbstractController{

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
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String id = userInfo.getId();
		
		//id를 memberDto에 담은 후, memberDto를 BoardDto에 담아준다. 
		MemberDto memberDto = new MemberDto();
		memberDto.setId(id);
		
		//글은 BoardTbl에 담아야한다. 
		BoardDto boardDto = new BoardDto();
		
		boardDto.setTitle(title);
		boardDto.setContent(content);
		boardDto.setMemberDto(memberDto);
		
		BoardDao boardDao = BoardDao.getInstance();
		
		boolean result = boardDao.insertBoard(boardDto);
		
		//글 등록 성공
		if(result) {
			return new ModelAndView("redirect:BoardList.do");
		//실패	
		}else {
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", "글 등록 실패");
			mav.addObject("url", "javascript:history.back();");
			return mav;
		}
		

	}

}
