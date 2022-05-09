package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GameServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int you = Integer.parseInt(request.getParameter("you"));
		int com = (int)(Math.random() * 3) + 1;
		

		//System.out.println(you + " , " + com);
		
		//you와 com을 request에 담는다.
		request.setAttribute("you", choose(you));
		request.setAttribute("com", choose(com));
		request.setAttribute("win", whoWinner(you, com));

		//넘어온 값을 request에 담아서 view(game_action.jsp)에 전달
		RequestDispatcher dispatcher = request.getRequestDispatcher("/game/game_action.jsp");
		dispatcher.forward(request, response);
	}
	

	private Object whoWinner(int you, int com) {
		if((you==1 && com==3) || (you==2 && com==1) || (you==3 && you == 2)) {
			return "당신의 승리입니다.";
		}else if(you == com) {
			return "무승부입니다";
		}else {
			return "컴퓨터의 승리입니다.";
		}
	}


	public String choose(int key){
		switch(key){
		case 1: return "가위";
		case 2: return "바위";
		case 3: return "보";
		default: return "Error";
		
		}
	}
	
	public String result(int you, int com) {
		
		String str = "의 승리입니다.";
		
		if(you > com) return "당신" + str;
		else if(you == com) return "무승부입니다";
		else return "컴퓨터" + str;
		
	}


}
