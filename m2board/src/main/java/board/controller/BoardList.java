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
		
		Long pg = 1L; // pg default 값, pg값이 넘어오지 않을 때의 디폴트값
		if(request.getParameter("pg") != null) {
			pg = Long.parseLong(request.getParameter("pg")); //값이 넘어오면 넘어온 값으로 페이징 처리 
		}
		System.out.println("현재 페이지 pg : " + pg);
		//한 페이지에 뿌리는 게시물 수
		int pageSize = 10;
		//페이지의 시작 번호 
		long startnum = (pg - 1) * pageSize + 1;
		//페이지의 끝번호 
		long endnum = pg * pageSize;
		
		String logInfo = userInfo.getName() + "(" + userInfo.getId() + ")님이 로그인하였습니다. ";
		
		BoardDao boardDao = BoardDao.getInstance();
		
		//전체 게시물(레코드) 수 
		long recordCount = boardDao.getRecordCount();
		//전체 페이지 수 
		long pageCount = recordCount / pageSize;
		//10개 단위외에 남은 레코드에 대한 페이지 개수 처리
		if(recordCount % pageSize != 0) pageCount++;
		// 한 블럭의 페이지 수 
		int blockSize = 10; 
		//현재 블럭의 첫 페이지 
		long startPage = (pg-1) / blockSize * blockSize + 1;
		//현재 블럭의 마지막 페이지
		long endPage =(pg-1) / blockSize * blockSize + blockSize;
		//마지막페이지 처리(블럭의 마지막 페이지가 전체 페이지 수를 초과하는 경우, 마지막 페이지를 전체 페이지 수와 맞춰준다.)
		if(endPage > pageCount) endPage = pageCount;
		
		List<BoardDto> list = boardDao.getBoardList(startnum, endnum);
		
		//가져온 리스트 확인
//		for(BoardDto boardDto : list) {
//			System.out.println(boardDto);
//		}
		
		ModelAndView mav = new ModelAndView("/WEB-INF/board/list.jsp");
		mav.addObject("logInfo", logInfo);
		mav.addObject("list", list); //리스트 꺼낼 이름
		//뷰로 페이지 보내기
		mav.addObject("pageCount", pageCount);
		mav.addObject("pg", pg);
		mav.addObject("startPage", startPage);
		mav.addObject("endPage", endPage);
		
		return mav;
	}

}
