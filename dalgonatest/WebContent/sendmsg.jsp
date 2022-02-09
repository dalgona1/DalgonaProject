<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "DalgoUtill.*" %>
<%
String msg = request.getParameter("msg");
System.out.println(msg);
if(msg == null)return;

DalgonaDB dbms = new DalgonaDB();
dbms.DBopen();
String sql = "";
sql = "insert into chat (cnote) ";
sql += "value ('" + msg + "') ";
dbms.RunSQL(sql);
dbms.DBClose();
%>