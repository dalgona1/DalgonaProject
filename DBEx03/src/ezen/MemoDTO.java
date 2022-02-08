package ezen;

import java.util.ArrayList;

public class MemoDTO extends DBManager //Data Transfo Object업데이트하는 클레스 메모클레스랑 연결시켜서    데이터전송용 객체
{
	private String _R(String value)
	{
		return value.replace("'","''");
	}
	
	//MemoVO를 DB에 저장한다.
	
	public boolean Insert(MemoVO vo)
	{
		//Insert를 실행한다.
		
		String sql;
		sql = "insert into memo";
		sql += "(mtitle,mnote)";
		sql += "values";
		sql += "('" + _R(vo.getTitle()) + "','" + _R(vo.getNote()) + "')";
		return RunSQL(sql);
		
	}
	
	//MemoVO를 Select한다.
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
	
	//MemoVO를 Delete한다.
	 public boolean Delete(int no)
	 {
		String sql;
		sql = "delete from memo where mno = " + no;
		return RunSQL(sql);
	 }
	 
	 //MemoVO를 Update한다.
	 public boolean Update(MemoVO vo)
	 {
		 String sql;
		 
		 sql = "update memo ";
		 sql += "set mtitle = '" + _R(vo.getTitle()) + "', ";
		 sql += "mnote = '" + _R(vo.getNote()) + "' ";
		 sql += "where mno = " + vo.getNo();
		 return RunSQL(sql);
	 }
	 
	 //MemoVO를 목록을 Select한다.
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
		 if(GetNext() == false)  return null;  //true오류
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
		
		//MemoVO 목록을 Select한다
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


	
