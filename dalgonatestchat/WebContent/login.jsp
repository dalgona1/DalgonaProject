<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인</title>
</head>
<body>	
	<center>
		<div style="width:500px; height:500px; margin-top:10%">
			<form id=login method="post" action="<%=request.getContextPath()%>/member/loginaciton.do">
				<div style="margin-top:20px"><a href="login.jsp"><img src="image/달고나.jpg" style="height:100px; width:120px"></a></div>
				<div>
					<input type="text" name="USER_ID" placeholder="아이디" style="width:80%; height:50px; font-size:20px;margin-top:25px">
				</div>
				<div>
					<input type="password" name="USER_PW" placeholder="비밀번호" style="width:80%; height:50px; font-size:20px;margin-top:25px">
				</div>
				<div style="margin-top:20px">
					<input type="submit" style="width:80%; height:50px; margin-bottom:10px; background-color:#31B5FF" value="로그인">
				</div>
			</form>
			<div style="margin-left:250px;padding:10px">
				<span><a href="join.jsp">직원등록은 하셨나요?</span>
			</div>
		</div>
	</center>	
</body>
</html>