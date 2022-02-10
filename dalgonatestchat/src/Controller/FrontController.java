package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String uri = request.getRequestURI();
		String pj = request.getContextPath();
		String command = uri.substring(pj.length());
		String[] str = command.split("/");
		System.out.println(str[1]);

		if (str[1].equals("member")) {
			MemberController mc = new MemberController();
			mc.doGet(request, response);
		}
//		}else if (str[1].equals("board")) {
//			BoardController bc = new BoardController();
//			bc.doGet(request, response);
//			
//		}
		else if (str[1].equals("chat")) {
			System.out.println("chat");
			ChatController cc = new ChatController();
			cc.doGet(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
