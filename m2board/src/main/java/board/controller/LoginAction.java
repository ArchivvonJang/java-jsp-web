package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.model.MemberDao;
import board.model.MemberDto;

public class LoginAction extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		MemberDto memberDto = new MemberDto();
		
		memberDto.setId(id);
		memberDto.setPassword(password);
		
		System.out.println(memberDto);
		
		//dto -> dao
		MemberDao memberDao = MemberDao.getInstance();
		
		MemberDto userInfo = memberDao.getUser(memberDto);
		
		
		
		//로그인 성공
		if(userInfo!=null) {
			
			//id, password 세션에 저장
			HttpSession session = request.getSession();
			session.setAttribute("userInfo", userInfo);
			
			//sendRedirect
			return new ModelAndView("redirect:BoardList.do");
			
		//로그인 실패	
		}else {
			ModelAndView mav = new ModelAndView("WEB-INF/board/result.jsp");
			
			mav.addObject("msg", "아이디 혹은 비밀번호를 확인해주세요.");
			mav.addObject("url", "Login.do");
			
			return mav;
		}
		
		
	}

}
