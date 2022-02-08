package ezen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManager 
{
	private Connection conn = null;	
	private String host = "";
	private String userid = "";
	private String passwd = "";
	private ResultSet result = null;
	private Statement stmt = null;
	
	public DBManager()
	{
		host = "jdbc:mysql://127.0.0.1:3306/ezen?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
		userid = "root";
		passwd = "ezen";
	}
	//메소드 안에 메소드 들어가지 못함
	public void setHost(String host)     { this.host = host;     }
	public void setUserid(String userid) { this.userid = userid; }
	public void setPasswd(String passwd) { this.passwd = passwd; }
	
	//DB를 연결한다.
	//리턴값: 성공시true 실패시false
	public boolean DBOpen()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//데이터 베이스에 연결한다.
			conn = DriverManager.getConnection(host,userid,passwd);
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	//insert,Update,Delete SQL 구문 처리
	public boolean RunSQL(String sql)//sql을 받겠다
	{
		try
		{
			Statement stmt = conn.createStatement();
			
			//insert 구문을 실행한다.
			stmt.executeUpdate(sql);
			stmt.close();
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	//DB를 닫는다.
	public void DBClose()
	{
		try
		{
			//데이터 베이스의 연결을 닫는다.
			conn.close(); //실행이 안될때 확인 해줘야 되는 코드
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//SQL Query를 실행한다.
	public boolean OpenQuery(String sql)
	{
		try
		{
			stmt = conn.createStatement();
			result = stmt.executeQuery(sql);
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	//다음 결과를 가져온다.
	public boolean GetNext()
	{
		try
		{
			return result.next();
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	public String GetValue(String column)
	{
		try
		{
			return result.getString(column);
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	//컬럼 값을 가져온다.
	public int GetInt(String column)//정수값을 가져오려고 만듬
	{
		try
		{
			return result.getInt(column);
		}catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
	}
	
	//SQL Query를 종료한다. 닫기만 하면 되니까 성공실패 상관없어서 void붙임
	public void CloseQuery()//닫을때는 거꾸로 마지막엔 DB가 닫힘
	{
		try
		{
			result.close();
			stmt.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

