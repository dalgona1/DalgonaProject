package ezen;

import java.util.ArrayList;

public class MemoDTO extends DBManager //Data Transfo Object������Ʈ�ϴ� Ŭ���� �޸�Ŭ������ ������Ѽ�    ���������ۿ� ��ü
{
	private String _R(String value)
	{
		return value.replace("'","''");
	}
	
	//MemoVO�� DB�� �����Ѵ�.
	
	public boolean Insert(MemoVO vo)
	{
		//Insert�� �����Ѵ�.
		
		String sql;
		sql = "insert into memo";
		sql += "(mtitle,mnote)";
		sql += "values";
		sql += "('" + _R(vo.getTitle()) + "','" + _R(vo.getNote()) + "')";
		return RunSQL(sql);
		
	}
	
	//MemoVO�� Select�Ѵ�.
	public MemoVO Select(int no)
	{
		String sql;
		sql = "select mno,mnote,mtitle,mdate ";
		sql += "from memo ";
		sql += "where mno = " + no;
		if(OpenQuery(sql) == false)
		{
			return null;
		}
	
		if(GetNext() == false) 
		{
			return null;
		}
		MemoVO vo = new MemoVO();
	
		vo.setNo(Integer.parseInt(GetValue("mno")));
		vo.setTitle(GetValue("mtitle"));
		vo.setNote(GetValue("mnote"));
		vo.setDate(GetValue("mdate"));
		CloseQuery();
		return vo;
	}
	
	//MemoVO�� Delete�Ѵ�.
	 public boolean Delete(int no)
	 {
		String sql;
		sql = "delete from memo where mno = " + no;
		return RunSQL(sql);
	 }
	 
	 //MemoVO�� Update�Ѵ�.
	 public boolean Update(MemoVO vo)
	 {
		 String sql;
		 
		 sql = "update memo ";
		 sql += "set mtitle = '" + _R(vo.getTitle()) + "', ";
		 sql += "mnote = '" + _R(vo.getNote()) + "' ";
		 sql += "where mno = " + vo.getNo();
		 return RunSQL(sql);
	 }
	 
	 //MemoVO�� ����� Select�Ѵ�.
	 /*
	 public MemoVO [] SelectList()
	 {
		 MemoVO [] volist = null;
		 MemoVO vo;
		 volist = new MemoVO[2];
		 
		 vo = new MemoVO();
		 vo.setNo(1);
		 vo.setTitle("title 1");
		 vo.setNote("note 1");
		 vo.setDate("2021-01-01");
		 volist[0] =vo;
		 
		 return volist;
		 */
	 public MemoVO [] SelectList()
	 {
		 MemoVO [] volist = null;
		 
		 
		 String sql;
		 sql = "select count(*) as count from memo ";
		 if(OpenQuery(sql) == false) return null;
		 if(GetNext() == false)  return null;  //true����
		 int maxrow = GetInt("count");		 
		 CloseQuery();
		 if(maxrow <= 0) return null;
		 volist = new MemoVO[maxrow];
		 
		 sql = "select mno,mnote,mtitle,mdate ";
		 sql += "from memo ";
		 sql += "order by mno asc ";
			
		int row = 0;
		if(OpenQuery(sql) == false)
		{
			return null;
		}
		while(GetNext() == true) 
		{
			MemoVO vo = new MemoVO();
			vo.setNo(Integer.parseInt(GetValue("mno")));
			vo.setTitle(GetValue("mtitle"));
			vo.setNote(GetValue("mnote"));
			vo.setDate(GetValue("mdate"));
			volist[row] = vo;
			row++;
		}
		CloseQuery();
		return volist;
	 }
		
		//MemoVO ����� Select�Ѵ�
		public ArrayList<MemoVO> SelectListEx()
		{
			ArrayList<MemoVO> array = null;
			array = new ArrayList<MemoVO>();
			
			String sql;
			sql = "select mno,mnote,mtitle,mdate ";
			sql += "from memo ";
			sql += "order by mno asc ";
				
			if(OpenQuery(sql) == false)
			{
				return null;
			}
			while(GetNext() == true) 
			{
				MemoVO vo = new MemoVO();
				vo.setNo(Integer.parseInt(GetValue("mno")));
				vo.setTitle(GetValue("mtitle"));
				vo.setNote(GetValue("mnote"));
				vo.setDate(GetValue("mdate"));
				array.add(vo);
			
		}
		
		CloseQuery();
		return array;
	 }
}


	
