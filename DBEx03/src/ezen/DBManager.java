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
	//�޼ҵ� �ȿ� �޼ҵ� ���� ����
	public void setHost(String host)     { this.host = host;     }
	public void setUserid(String userid) { this.userid = userid; }
	public void setPasswd(String passwd) { this.passwd = passwd; }
	
	//DB�� �����Ѵ�.
	//���ϰ�: ������true ���н�false
	public boolean DBOpen()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//������ ���̽��� �����Ѵ�.
			conn = DriverManager.getConnection(host,userid,passwd);
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	//insert,Update,Delete SQL ���� ó��
	public boolean RunSQL(String sql)//sql�� �ްڴ�
	{
		try
		{
			Statement stmt = conn.createStatement();
			
			//insert ������ �����Ѵ�.
			stmt.executeUpdate(sql);
			stmt.close();
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
			//������ ���̽��� ������ �ݴ´�.
			conn.close(); //������ �ȵɶ� Ȯ�� ����� �Ǵ� �ڵ�
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//SQL Query�� �����Ѵ�.
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
	//���� ����� �����´�.
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
	//�÷� ���� �����´�.
	public int GetInt(String column)//�������� ���������� ����
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
	
	//SQL Query�� �����Ѵ�. �ݱ⸸ �ϸ� �Ǵϱ� �������� ������ void����
	public void CloseQuery()//�������� �Ųٷ� �������� DB�� ����
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

