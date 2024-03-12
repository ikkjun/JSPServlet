package dice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DiceServlet
 */
@WebServlet("/DiceServlet")
public class DiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int score = 0;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String age = request.getParameter("age");
		
		int firstDiceNum = (int)(Math.random()*6 + 1);
		int secondDiceNum = (int)(Math.random()*6 + 1);
		score = firstDiceNum + secondDiceNum;
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<img src='./dice/dice"+ firstDiceNum +".jpg'>");
		out.println("<img src='./dice/dice"+ secondDiceNum +".jpg'><br>");
		out.println("<h2>Your score is " + score + "</h2>");
		out.println("</body>");
		out.println("</html>");
	}

}
