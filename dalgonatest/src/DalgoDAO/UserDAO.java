package DalgoDAO;

import java.sql.PreparedStatement;

import DalgoUtill.DalgonaDB;
import DalgoVO.UserVO;

public class UserDAO {
	
	String 	  sql;
	
	//유저 정보 등록하기
	public boolean UserInsert(UserVO uvo) {
		DalgonaDB ddb =new DalgonaDB();
		ddb.DBopen();
		sql  = "insert into User_Info ";
		sql += " (User_No, USER_ID, USER_PW, USER_CAR, USER_KR, USER_CH, USER_PNO, USER_GEN, USER_ADD, USER_CM, USER_KG, USER_SH, USER_BT, USER_COLOR) ";
		sql += "values(User_Auto.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		ddb.RunSQL(sql, uvo.getUSER_ID(), uvo.getUSER_PW(), uvo.getUSER_CAR(), uvo.getUSER_KR(), uvo.getUSER_CH(), uvo.getUSER_PNO(), uvo.getUSER_GEN(), uvo.getUSER_ADD(), uvo.getUSER_CM(), uvo.getUSER_KG(),	uvo.getUSER_SH(), uvo.getUSER_BT(), uvo.getUSER_COLOR());
		ddb.DBClose();
		return  true;
	}
}
