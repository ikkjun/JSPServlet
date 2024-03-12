package dice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FortuneTeller")
public class FortuneTeller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		ArrayList<String> fortuneComment = new ArrayList<>();
		
		fortuneComment.add("오늘은 행운의 날이야! 즐거운 하루 보내세요.");
		fortuneComment.add("당신의 미래는 밝습니다! 무엇이든 이룰 수 있어요.");
		fortuneComment.add("긍정적인 생각으로 삶을 즐기세요. 행복이 기다리고 있어요.");
		fortuneComment.add("모든 것은 당신의 손에 달려 있어요. 당신의 꿈을 이루세요!");
		fortuneComment.add("어제보다 오늘이 더 나은 날이 될 거예요. 자신을 믿어보세요.");
		fortuneComment.add("인생은 어떻게 보느냐에 달려 있어요. 긍정적인 마음가짐으로 가득 채워");
		fortuneComment.add("매일이 새로운 기회야. 새로운 시작을 하세요!");
		fortuneComment.add("오늘은 무엇이든 할 수 있어요. 자신을 믿으세요.") ;
		fortuneComment.add("당신의 노력은 결코 헛되지 않아요. 이루고자 하는 모든 것을 이룰 거예요");
		fortuneComment.add("당신은 특별해요. 자신에게 좋은 것만 생각해보세요.");
		fortuneComment.add("당신의 미래는 밝고 희망차게 빛나고 있어요.");
		fortuneComment.add("지금의 어려움은 미래의 성취를 위한 준비일 뿐이에요.");
		fortuneComment.add("오늘은 기쁨과 행복으로 가득한 하루가 될 거예요.");
		fortuneComment.add("당신의 미래는 밝아요. 자신을 믿고 앞으로 나아가세요.");
		fortuneComment.add("당신은 뛰어난 능력을 가졌어요. 그것을 발휘하세요!");
		fortuneComment.add("당신의 미래는 성공과 행운으로 가득할 거예요.");
		fortuneComment.add("오늘은 즐거운 일이 기다리고 있어요. 기대해도 좋아요!");
		fortuneComment.add("자신을 사랑하고 자신을 믿으세요. 모든 것이 가능할 거예요.");
		fortuneComment.add("오늘은 좋은 일이 일어날 거예요. 기대가 되죠!");
		fortuneComment.add("당신의 미래는 밝아요. 당신은 특별한 사람이에요.");
		fortuneComment.add("오늘은 행복과 기쁨이 함께할 거예요. 즐겁게 보내세요!");
		fortuneComment.add("당신은 강하고 용감한 사람이에요. 어려움을 이겨낼 수 있어요.");
		fortuneComment.add("당신은 충분히 멋진 사람이에요. 자신을 믿어주세요.");
		fortuneComment.add("당신은 특별한 사람이에요. 당신의 미래는 밝습니다.");
		fortuneComment.add("오늘은 행운의 날이에요. 당신의 꿈을 이루는 시작일 거예요!");
		fortuneComment.add("당신은 뛰어난 능력을 가졌어요. 그것을 발휘하세요!");
		fortuneComment.add("당신의 자신감이 성공으로 이끌 거예요. 자신에게 믿음을 가져보세요.");
		fortuneComment.add("오늘은 새로운 시작의 날이에요. 당신이 가는 길은 밝습니다.");
		fortuneComment.add("당신의 미래는 희망찬 일들로 가득할 거예요. 기대해주세요!");
		fortuneComment.add("오늘은 당신의 운이 최고조에 달할 거예요. 기대해도 좋아요!");
		fortuneComment.add("당신은 특별한 사람이에요. 자신을 믿으세요. 행복이 당신을 기다리고");
		
		request.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/html;charset=UTF-8");
		
		String uname = request.getParameter("uname");
		String age = request.getParameter("age");
		String birth = request.getParameter("birth");
		
		Calendar calendar = Calendar.getInstance(); // 현재 날짜를 가리키는 객체 생성
		int today = calendar.get(Calendar.DAY_OF_MONTH);
		
		int fortuneNum = Math.abs(today - Integer.parseInt(birth.substring(8)));
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>안녕하세요 " + uname + "님.</h1>");
		out.println("<h1>당신의 나이는 " + age + "세입니다.</h1>");
		out.println("<h2>당신의 생일은 " + birth + "입니다.</h2>");
		out.println("<p>" + fortuneComment.get(fortuneNum) + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
