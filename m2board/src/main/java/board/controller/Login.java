package board.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cookie.Cooker;

public class Login extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		
		Cooker cooker = new Cooker(request);
		String id = "";
		
		if(cooker.isExist("id")) {
			try {
				id = cooker.getValue("id");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			
		}
		
		return new ModelAndView("/WEB-INF/board/login.jsp", "id", id); //id란 이름으로 쿠키도 보내기
	}

	
}
