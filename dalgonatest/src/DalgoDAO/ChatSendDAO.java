package DalgoDAO;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DalgoUtill.DalgonaDB;

/**
 * Servlet implementation class ChatSendDAO
 */
@WebServlet("/ChatSendDAO.do")
public class ChatSendDAO extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChatSendDAO() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String msg = request.getParameter("msg");
		System.out.println(msg);
		if(msg == null)return;
	
		DalgonaDB dbms = new DalgonaDB();
		dbms.DBopen();
		String sql = "";
		sql = "insert into chat (cnote) ";
		sql += "value ('" + msg + "') ";
		dbms.RunSQL(sql);
		dbms.DBClose();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
