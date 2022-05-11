package board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.MemberDao;
import board.model.ZipcodeDto;

public class Zipcode extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		//area값이 객체에 실려서 넘어온다.
		String area = request.getParameter("area");
		//확인해보기
		System.out.println("area : " + area);
		
		 //최초 주소찾기 화면 띄울 때
		if(area == null) {
			return new ModelAndView("/WEB-INF/board/zipcode.jsp");
			
		//주소 검색할 때
		}else { 
			//주소 목록을 DB에 담고 ModelAndView를 통해 가져온다.
			//싱글턴 패턴으로 가져온다. (객체를 만들지 않고)
			MemberDao memberDao = MemberDao.getInstance();
			//DAO에 area값을 가져온다.
			//그리고 주소리스트를 얻어오기 위해 searchZipcode에 담아서 보낸다.
			List<ZipcodeDto> list = memberDao.searchZipcode(area);
			
			//확인
//			for(ZipcodeDto zipcodeDto : list) {
//				System.out.println(zipcodeDto);
//			}
			
			//mav에 담아서 반환
			ModelAndView mav = new ModelAndView("/WEB-INF/board/zipcode.jsp");
			//list라는 이름으로 list를 보내준다. 
			mav.addObject("list", list); 
			mav.addObject("area", area); //기록에 남을 수 있게 같이 보내준다.
			return mav;
		}
		
		
	}

}
