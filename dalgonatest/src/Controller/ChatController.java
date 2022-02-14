package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DalgoDAO.ChatDAO;
import DalgoDAO.UserDAO;
import DalgoVO.ChatVO;
import DalgoVO.UserVO;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/ChatController")
public class ChatController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String uri	   = request.getRequestURI();
		String pj  	   = request.getContextPath();
		String command = uri.substring(pj.length());
		
		ChatVO cvo = new ChatVO();
		ChatDAO cdao = new ChatDAO();
		UserVO uvo = new UserVO();
		HttpSession session = request.getSession();
		
		if(command.equals("/chat/ChatSend.do")) {
		
			String msg = request.getParameter("msg");
			System.out.println("msg"+msg);
			
			cvo.setChat_NOTE(msg);
			
			cdao.ChatInsert(cvo);
			
			
			 //response.sendRedirect(request.getContextPath() + "/login.jsp");
//			RequestDispatcher disp = request.getRequestDispatcher("/login.jsp");
//			disp.forward(request, response);
		}
		else if(command.equals("/chat/ChatGet.do")) {
			System.out.println("현제 로그인 번호");
			cdao.ChatSelect(uvo.getUSER_NO());
			System.out.println("현제 로그인 번호" + uvo.getUSER_NO());
			
		}
//		}else if(command.equals("/member/loginaciton.do")) {
			
	//		response.sendRedirect(request.getContextPath() + "/main_view.jsp");
	//	}
//		}else if(command.equals("/member/LoginAction.do")) {
//			String id = request.getParameter("memberId");
//			String pw = request.getParameter("memberpw");
//			
//			MemberDAO dao = new MemberDAO();
//			MemberVO vo = dao.MemberLogin(id, pw);
//			HttpSession session = request.getSession();
//			session.setAttribute("memberId", vo.getMemberId());
//			session.setAttribute("memberpw", vo.getMemberpw());
//			
//			response.sendRedirect(request.getContextPath() + "/index.jsp");
//		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
