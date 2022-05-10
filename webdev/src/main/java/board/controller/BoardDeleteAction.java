package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDao;
import board.model.BoardDto;

public class BoardDeleteAction extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		//넘길 데이터들을 갖고와서 변수에 담아준다.
		Long no = Long.parseLong(request.getParameter("no"));
		String password = request.getParameter("password");
		
		//DTO에 담아준다.
		BoardDto boardDto = new BoardDto();
		
		boardDto.setNo(no);
		boardDto.setPassword(password);
		
		//잘 넘어가는지 확인
		System.out.println(boardDto);

		//DTO를 DAO에 넘겨준다. 
		//Singleton으로 얻어온다.
		BoardDao boardDao = BoardDao.getInstance();
		boolean result = boardDao.deleteBoard(boardDto);

		ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
		
		//요청처리한 결과를 담는다.
		if(result) {
			//글 삭제 성공하면 바로 List로 이동
			mav.addObject("msg", no+"번 글이 삭제되었습니다.");
			mav.addObject("url", "BoardList.do");
		}else {
			//요청 처리 실패 시, 다음 이동할 경로를 지정한다.			
			mav.addObject("msg", "[글 삭제 실패] 비밀번호를 확인해주세요.");
			mav.addObject("url", "javascript:history.back();");
		}
		//mav에 담아서 frontcontroller로 보내준다.
		return mav;
	
	}

}
