package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDao;
import board.model.BoardDto;

public class BoardInsertAction extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		String title = request.getParameter("title");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String content = request.getParameter("content");
		
		//DTO에 담아준다.
		BoardDto boardDto = new BoardDto();
		
		boardDto.setTitle(title);
		boardDto.setName(name);
		boardDto.setPassword(password);
		boardDto.setContent(content);
		
		//잘 넘어가는지 확인
		System.out.println(boardDto);
		//BoardDto [no=null, title=ff, name=ff, password=ff, content=ff, writeday=null, readcount=null]
	
		//DTO를 DAO에 넘겨준다. 
		//Singleton으로 얻어온다.
		BoardDao boardDao = BoardDao.getInstance();
		boolean result = boardDao.insertBoard(boardDto);

		//요청처리한 결과를 담는다.
		if(result) {
			//글쓰기 성공하면 바로 List로 이동
			return new ModelAndView("redirect:BoardList.do");
		}else {
			//다음 이동할 경로를 지정한다.
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", "글 등록실패");
			mav.addObject("url", "javascript:history.back();");
			//mav에 담아서 frontcontroller로 보내준다.
			return mav;
			
		}

	
	}

}
