package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		
			
			String   uSER_ID =  request.getParameter("User_Id");
			System.out.println("1" + uSER_ID);
			
			String   uSER_PW =  request.getParameter("User_Pw");
			System.out.println("2" + uSER_PW);
			
			String   uSER_CAR =  request.getParameter("User_Car");
			System.out.println("3" + uSER_CAR);
			
			String   uSER_KR =  request.getParameter("User_Kr");
			System.out.println("4" + uSER_KR);
			
			String   uSER_CH =  request.getParameter("User_Ch");
			System.out.println("5" + uSER_CH);
			
			String   uSER_PNO =  request.getParameter("User_Pno");
			System.out.println("6" + uSER_PNO);
			
			String   uSER_GEN =  request.getParameter("User_Gen");
			System.out.println("7" + uSER_GEN);
			
			String   uSER_ADD =  request.getParameter("User_Add");
			System.out.println("8" + uSER_ADD);
			
			String   uSER_CM =  request.getParameter("User_Cm");
			System.out.println("9" + uSER_CM);
			
			String   uSER_KG =  request.getParameter("User_Kg");
			System.out.println("10" + uSER_KG);
			
			String   uSER_SH =  request.getParameter("User_Sh");
			System.out.println("11" + uSER_SH);
			
			String   uSER_BT =  request.getParameter("User_Bt");
			System.out.println("12" + uSER_BT);
			
			String   uSER_COLOR =  request.getParameter("User_Color");
			System.out.println("13" + uSER_COLOR);
			
			
			 UserDAO udao = new UserDAO(); 
			 UserVO uvo   = new UserVO();
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
			
//		}else if(command.equals("/member/login.do")) {
//			RequestDispatcher disp = request.getRequestDispatcher("/Login.jsp");
//			disp.forward(request, response);
//			
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
