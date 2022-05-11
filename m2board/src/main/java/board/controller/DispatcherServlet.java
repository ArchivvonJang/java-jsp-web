package board.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {

	private Map<String, AbstractController> actionMap = new HashMap<String, AbstractController>();
	
	@Override
	public void init() throws ServletException {
		String props = this.getClass().getResource("dispatcher.properties").getPath();
		Properties pr = new Properties();
		FileInputStream f = null; //properties 파일을 읽어오기 위한 스트림
		
		try {
			f = new FileInputStream(props);
			pr.load(f);//stream연결
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(f!=null) try {f.close();} catch(Exception e) {}
		}
		
		
		for(Object obj : pr.keySet()) {
			//key는 /BoardList.do 이것들
			String key = ((String) obj).trim(); 
			//class이름을 얻어온다. board.controller.BoardList 이것들
			String className = (pr.getProperty(key)).trim();
			
			try{
				//Reflection
				//className의 정보를 가지고 있는 클래스의 타입을 얻어온다. 
				Class<?> actionClass = Class.forName(className);
				//new BoardInsert()처럼 만들어준다. 
				AbstractController controller = (AbstractController) actionClass.getConstructor().newInstance();
				//그리고 정보를 Map에 담는다. /BoardList.do(키)=board.controller.BoardList(값)
				actionMap.put(key, controller);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String action = requestURI.substring(request.getContextPath().length()); // /webdev/*.do에서 /webdev까지 자른다.
		System.out.println(action);// /*.do
		
		AbstractController controller = null;
		ModelAndView mav = null; //다음 이동할 View 이름과 View에 뿌려줄 data를 담는 객체 
		
		//해당요청이 넘어오면, action에 따라 이동경로를 갖고 있는 actionMap호출
		controller = actionMap.get(action);
		mav = controller.handleRequestInternal(request, response);
		
		//model and view를 잘 넘겨받았을 때만 아래와 같이 이동 
		if(mav!=null) {
			
			String viewName = mav.getViewName();
			
			if(viewName.startsWith("redirect:")) {
				//다음 경로가 redirect:로 시작하면 아래와 같이 이동한다.
				//그리고 redirect:까지 자른 뒷부분을 실행
				response.sendRedirect(viewName.substring("redirect:".length()));
				
				//글등록 성공하면 아래로 이동(result로)할 필요없이 바로 목록으로 return;
				return;
			}
			
			//mav에 담은 것들을 request에 key, value로 담는다.
			Map<String, Object> model = mav.getModel();
			for(String key : model.keySet()) {
				//꺼낸 키값으로 value를 reqeust로 옮긴다.
				request.setAttribute(key, model.get(key)); //key에 해당하는 value값을 얻는다.
			}		

			//다음 이동할 경로는 ModelAndView가 갖고 있다. 여기서 getViewName해준다.
			RequestDispatcher dispatcher = request.getRequestDispatcher(mav.getViewName());
			dispatcher.forward(request, response);
		
		}else {
			//ModelAndView에 없거나, 오타거나.
			System.out.println("DispatcherServlet 긿을 잃었다. 어디로 가야할까. ");
		}
		

		
	}

}
