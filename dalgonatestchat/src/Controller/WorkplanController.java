package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DalgoDAO.WorkplanDAO;

@WebServlet("/WorkplanController")
public class WorkplanController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());		
		String uri = request.getRequestURI();
		String pj = request.getContextPath();
		String command = uri.substring(pj.length());
		
		System.out.println(command);
		
		//∞Ë»π ª¿‘
		if(command.equals("/work/WorkInsert.do")) {
			
		}
		//∞Ë»π ºˆ¡§
		else if(command.equals("/work/WorkModify.do")) {
			
		}
		//∞Ë»π ªË¡¶
		else if(command.equals("/work/WorkDelete.do")) {
			
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
