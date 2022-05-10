package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Iam extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		//System.out.println("name : " + name + " ,age : " + age);
		String iam = say(name, age);
		
		request.setAttribute("iam", iam);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ajax01/iam2.jsp");
		dispatcher.forward(request, response);
	}

	private String say(String name, int age) {
		String msg = null;
		
		if(name.equals("김아무개")){
			msg = "난"+ name +"쓰 "+ age + "살인디";
		}else if(name.equals("직장인")){
			msg = "안녕하세요. 직업은 " + name + ", 나이는 "+ age + "입니다.";
		}else if(name.equals("김와와")){
			msg = "안녕하세요. 오늘은 " + name + ", 나이는 "+ age + "입니다.";
		}else{
			msg = "야아아!!!! " + name + ", "+ age + "살!!!";
		}
		return msg;
	}
}
