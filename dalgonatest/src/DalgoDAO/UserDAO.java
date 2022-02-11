package DalgoDAO;


import DalgoUtill.DalgonaDB;
import DalgoVO.UserVO;

public class UserDAO {
	DalgonaDB ddb;
	String 	  sql;
	
	//유저 정보 등록하기
	public boolean UserInsert(UserVO uvo) {
		ddb = new DalgonaDB();
		ddb.DBopen();
		sql  = "insert into User_Info ";
		sql += "(User_No, USER_ID, USER_PW, USER_CAR, USER_KR, USER_CH, USER_PNO, USER_GEN, USER_ADD, USER_CM, USER_KG, USER_SH, USER_BT, USER_COLOR) ";
		sql += "values(User_Auto.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		ddb.RunSQL(sql, uvo.getUSER_ID(), uvo.getUSER_PW(), uvo.getUSER_CAR(), uvo.getUSER_KR(), uvo.getUSER_CH(), uvo.getUSER_PNO(), uvo.getUSER_GEN(), uvo.getUSER_ADD(), uvo.getUSER_CM(), uvo.getUSER_KG(),	uvo.getUSER_SH(), uvo.getUSER_BT(), uvo.getUSER_COLOR());
		ddb.DBClose();
		return  true;
	}
	
	public boolean UserSelect() {
		ddb.DBopen();
		sql = "SELECT * FROM USER_INFO ORDER BY USER_NO ASC ";
		ddb.RunQuery(sql);
		
		ddb.DBClose();
		
		return true;
	}
	
	//로그인 하기
	public UserVO MemberLogin(String USER_ID, String USER_PW) {
		UserVO uvo = new UserVO();
		ddb = new DalgonaDB();
		ddb.DBopen();
		sql  = "select User_No, USER_ID, USER_PW, USER_CAR, USER_KR, USER_CH, USER_PNO, USER_GEN, ";
		sql += "USER_ADD, USER_CM, USER_KG, USER_SH, USER_BT, USER_COLOR from User_Info ";
		sql += "Where USER_ID = ? and USER_PW = ?";
		ddb.RunQuery(sql, USER_ID, USER_PW);
		if(ddb.GetNext()) {
			uvo.setUSER_NO(ddb.GetString("User_No"));
			uvo.setUSER_ID(ddb.GetString("USER_ID"));
			ddb.DBClose();
		}
		return uvo;
	}
}
