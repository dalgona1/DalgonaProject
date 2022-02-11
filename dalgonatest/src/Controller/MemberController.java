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

import DalgoDAO.UserDAO;
import DalgoVO.UserVO;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String uri	   = request.getRequestURI();
		String pj  	   = request.getContextPath();
		String command = uri.substring(pj.length());
		System.out.println(command);
		if(command.equals("/member/join.do")) {
						
			String   uSER_ID =  request.getParameter("User_Id");
			String   uSER_PW =  request.getParameter("User_Pw");
			String   uSER_CAR =  request.getParameter("User_Car");
			String   uSER_KR =  request.getParameter("User_Kr");
			String   uSER_CH =  request.getParameter("User_Ch");
			String   uSER_PNO =  request.getParameter("User_Pno");
			String   uSER_GEN =  request.getParameter("User_Gen");
			String   uSER_ADD =  request.getParameter("User_Add");
			String   uSER_CM =  request.getParameter("User_Cm");
			String   uSER_KG =  request.getParameter("User_Kg");
			String   uSER_SH =  request.getParameter("User_Sh");
			String   uSER_BT =  request.getParameter("User_Bt");
			String   uSER_COLOR =  request.getParameter("User_Color");
			
			UserVO uvo = new UserVO();
			UserDAO udao = new UserDAO();
			 
			 uvo.setUSER_ID(uSER_ID);
			 uvo.setUSER_PW(uSER_PW);
			 uvo.setUSER_CAR(uSER_CAR);
			 uvo.setUSER_KR(uSER_KR);
			 uvo.setUSER_CH(uSER_CH);
			 uvo.setUSER_PNO(uSER_PNO);
			 uvo.setUSER_GEN(uSER_GEN);
			 uvo.setUSER_ADD(uSER_ADD);
			 uvo.setUSER_CM(uSER_CM);
			 uvo.setUSER_KG(uSER_KG);
			 uvo.setUSER_SH(uSER_SH);
			 uvo.setUSER_BT(uSER_BT);
			 uvo.setUSER_COLOR(uSER_COLOR);
			 
			 udao.UserInsert(uvo);
			
			 response.sendRedirect(request.getContextPath() + "/login.jsp");
//			RequestDispatcher disp = request.getRequestDispatcher("/login.jsp");
//			disp.forward(request, response);
		
		}else if(command.equals("/member/loginaciton.do")) {
			String USER_ID = request.getParameter("USER_ID");
			String USER_PW = request.getParameter("USER_PW");
			UserVO uvo = new UserVO();
			UserDAO udao = new UserDAO();
			
			uvo = udao.MemberLogin(USER_ID, USER_PW);
			
			HttpSession session = request.getSession();
			session.setAttribute("Id", uvo.getUSER_ID());
			session.setAttribute("Pw", uvo.getUSER_PW());
			
			response.sendRedirect(request.getContextPath() + "/main_view.jsp");
		}else if(command.equals("/member/memberlist.do")){
			
			
		}
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
