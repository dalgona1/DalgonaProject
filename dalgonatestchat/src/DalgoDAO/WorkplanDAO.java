package DalgoDAO;

import java.sql.*;

import DalgoVO.WorkplanVO;

public class WorkplanDAO {

	Connection conn;
	
	//=====================================플랜 삽입=====================================
	public int WorkInsert(WorkplanVO vo) {
		
		int exec = 0;
		
		//DBOpen
		String sql = "insert into Workplan(User_No, Wp_No, Wp_Note, Wp_Start, Wp_End) ";
		sql += "values(?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getUser_No());
			pstmt.setInt(2, vo.getWp_No());
			pstmt.setString(3, vo.getWp_Note());
			pstmt.setString(4, vo.getWp_Start());
			pstmt.setString(5, vo.getWp_End());
			exec = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return exec;
	}
	//=====================================플랜 삽입=====================================
	
	//=====================================플랜 수정=====================================
	public int WorkModify(int User_No, int Wp_No, String Wp_Note, String Wp_Start, String Wp_End) {
			
		int exec = 0;
		
		//DBOpen
		String sql = "update Workplan set Workplan(User_No, Wp_No, Wp_Note, Wp_Start, Wp_End) ";
		sql += "values(?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, User_No);
			pstmt.setInt(2, Wp_No);
			pstmt.setString(3, Wp_Note);
			pstmt.setString(4, Wp_Start);
			pstmt.setString(5, Wp_End);
			exec = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return exec;
	}
	//=====================================플랜 수정=====================================
	
	//=====================================플랜 삭제=====================================
		public int WorkDelete() {
				
			int exec = 0;
			
			//DBOpen
			String sql = "delete from Workplan";
			
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);

				exec = pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			return exec;
		}
		//=====================================플랜 삭제=====================================
		
}
