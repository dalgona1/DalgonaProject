package DalgoDAO;

import DalgoUtill.DalgonaDB;
import DalgoVO.ChatVO;

public class ChatDAO {
	DalgonaDB ddb;
	String 	  sql;
	
	public boolean ChatInsert(ChatVO cvo) {
		ddb = new DalgonaDB();
		
		System.out.println(ddb);
		
		ddb.DBopen();
		sql = "insert into Chat";
		sql += "(Chat_NO,Chat_NOTE) ";
		sql += "values(Chat_Auto.NEXTVAL, ?)";
		System.out.println(sql);
		
		ddb.RunSQL(sql,cvo.getChat_NOTE());
		
		ddb.DBClose();
		
		return true;
	}
	public boolean ChatSelect() {
		
		ddb.DBopen();
		//sql = "select * from Chat_Info where Chat_NO > " + no + " ";
		
		return true;
	}
}
