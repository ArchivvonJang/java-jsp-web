package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckID extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println("id : " + id);
		
		//userDao로 id 넘기기
		UserDao userDao = UserDao.getInstance();
		int count = userDao.countID(id); //1 or 0
		System.out.println("count " + count);
		
		//결과값을 담아서 view로 보내주기
		request.setAttribute("count", count);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ajax01/checkid.jsp");
		dispatcher.forward(request, response);
		
	}
}
