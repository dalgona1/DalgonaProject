package ezen;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB 
{
	Connection conn = null;
	public boolean DBOpen()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver"); //��Ű�� �ε�
			
			String host = "jdbc:mysql://127.0.0.1:3306/ezen";
			host += "?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
			String userid = "root";
			String passwd = "ezen";
			
			//������ ���̽��� �����Ѵ�.
			
			conn = DriverManager.getConnection(host,userid,passwd);	
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;	
	}
	//DB�� �ݴ´�.
	public void DBClose()
	{
		try
		{
			conn.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
