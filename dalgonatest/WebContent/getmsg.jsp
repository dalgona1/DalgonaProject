<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "DalgoUtill.*" %>
<%
String no = request.getParameter("cno");//변수명이 겹치지때문에 no로받음
if(no == null) no="0"; //no가 널이면 0으로

DalgonaDB dbms = new DalgonaDB();
dbms.DBopen();
String sql = "";
//순서대로 오름차순 하려면 새로 받은 cno보다 큰 cno 메시지만 출력
sql = "select cno,cdate,cnote ";
sql += "from chat ";
sql += "where cno > " + no + " ";
sql += "order by cno asc ";
dbms.RunQuery(sql);

while(dbms.GetNext() == true)
{
	String cno 	 = dbms.GetString("cno");
	String cdate = dbms.GetString("cdate");
	String cnote = dbms.GetString("cnote");
	
	cnote = cnote.replace("<","&lt;"); //채팅에 HTML태그안먹게함
	cnote = cnote.replace(">","&gt;");
	
	//out.print("[" + cdate + "]" + cnote + "<br>");
	out.print(cno);
	out.print("<!--EOF-->");
	out.print("[" + cdate + "]" + cnote + "<br>");
	out.print("<!--EOR-->");
}
//dbms.CloseQuery();
dbms.DBClose();
%>
