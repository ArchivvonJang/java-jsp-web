package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.model.BoardDao;
import board.model.BoardDto;
import board.model.MemberDto;

public class BoardDeleteAction extends AbstractController{

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
		String id = userInfo.getId(); //session에서 얻어온 아이디
		
		//id를 memberDto에 담은 후, memberDto를 BoardDto에 담아준다. 
		MemberDto memberDto = new MemberDto();
		memberDto.setId(id);
		
		//글은 BoardTbl에 담아야한다.
		BoardDto boardDto = new BoardDto();
		
		boardDto.setNo(no);
		boardDto.setMemberDto(memberDto);
		
		BoardDao boardDao = BoardDao.getInstance();

		boolean result = boardDao.deleteBoard(boardDto);		

		ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
		
		//글 수정 성공
		if(result) {
			mav.addObject("msg", no+"번 게시글이 삭제되었습니다.");
			mav.addObject("url", "BoardList.do");
		//실패	
		}else {	
			mav.addObject("msg", "글 삭제 실패");
			mav.addObject("url", "javascript:history.back();");
			
		}
		return mav;
	}

}
