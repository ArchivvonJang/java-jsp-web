package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class HelloServlet extends HttpServlet {
//외부 클라이언트 요청이 이 곳으로 넘어오도록 WEB.XML에서 설정	
	//최초의 service method 먼저 호출
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		
		//response.setContentType("text/html");
		//response.setCharacterEncoding("UTF-8");		
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter(); 
		out.println("<html>");
		out.println("<head><title>test servlet</title></head>");
		out.println("<body><h1>안녕하세요. "+ name +"님 (Service)</h1></body></html>");
		out.close();
	
	}
	
	//default => get방식
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		
		response.setContentType("text/html;charset=UTF-8"); //browser에게 보낼 응답
		PrintWriter out = response.getWriter(); //출력하기 위한 Stream을 얻어온다.
		out.println("<html>");
		out.println("<head><title>test servlet</title></head>");
		out.println("<body><h1>안녕하세요. "+ name +"님 (GET)</h1></body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		
		response.setContentType("text/html;charset=UTF-8"); //browser에게 보낼 응답
		PrintWriter out = response.getWriter(); //출력하기 위한 Stream을 얻어온다.
		out.println("<html>");
		out.println("<head><title>test servlet</title></head>");
		out.println("<body><h1>안녕하세요. "+ name +"님 (POST)</h1></body></html>");
		out.close();
	}

}
