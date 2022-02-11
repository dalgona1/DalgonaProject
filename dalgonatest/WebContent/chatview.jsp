<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "DalgoUtill.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="js/jquery-3.6.0.js"></script>
		<!--  script src="chat.js" charset="utf-8"></script -->
		<script type="text/javascript">
		$(document).ready(function(){
			alert("test");
			var msg;
			/* setInterval(function()
			{
				GetMsg();
			}, 1000);
			GetMsg(); //접속하자마자 나옴 */
			$("#btnSend").click(function(){

				if($("#msg").val() == "")
				{
					alert("발송 메시지 입력 바람");
					$("#msg").focus();
				}
				msg = $("#msg").val();
				$.ajax({				
					type : "get",
					url : "<%=request.getContextPath()%>/chat/ChatSend.do",
					dataType : "html",
					data: { msg: msg},
					error:function(xhr,status,e){
	                     alert('Error');
	             	 },
					success : function(data)
					{
						alert("success");
						$("#msg").val("");
						$("#msg").focus();
						//GetMsg();
					}
				});
			});	
		});
		function GetMsg()
		{
			$.ajax({
				type : "get",
				url : "<%=request.getContextPath()%>/chat/ChatSend.do?cno=" + cno,//0
				dataType : "html",
				success : function(data)
				{
					/*
					var org_html = $("#chatMsg").html();
					org_html = data + org_html;
					$("#chatMsg").html(org_html);
					*/
					//alert(data);
					data = data.trim();
					var aryMsg = data.split("<!--EOR-->");
					for(i=0;i<aryMsg.length;i++)
					{
						var item = aryMsg[i].split("<!--EOF-->");
						if(item[0] != "")
						{
							cno = item[0];
							var org_html = $("#getmsg").html();
							org_html = item[1] + org_html;
							$("#getmsg").html(org_html);
						}
					}
				}
			});
		}
	
		</script>
		
		<style>
			div{			
				border: 1px solid;
			}
			a{
				text-decoration:none
			}
#scroll{
	overflow:auto;
	display:block; 
	width:100%; 
	height: 100%; 
	border:none;
}
.scroll::-webkit-scrollbar{
	
	width:0px;
	height:0px;
	background-color: #BFCBD1;
	border-radius:10px;
}
.scroll::-webkit-scrollbar-thumb{
	background-color: #35517C;
	border-radius:10px;
}
		</style>
	</head>
	
	<body>
	<div style="width:350px;" >		
		<div style="width:100%;height:50px;">
			<a href="chat.jsp"><span style="margin-left:7px">â</span></a>
			<span style="margin-left:300px">X</span>				
		</div>
		<div id="scroll" class="scroll" style="border:none; width:100%; height: 500px; display:flex; align-items:center; flex-direction:column">					
			<div  style="width:100%; height:80px; border:none;">
				<span id="getmsg" name="getmsg"></span>
			</div>
				
			<div style="width:360px; margin-right:5px; margin-top:500px; position:fixed; display:flex;">			
				<div style="width:100%">
					<input type="text" id="msg" name="msg" style="width:100%; height:70px">
				</div>
				<div>
					<input type="button" value="업로드" id="btnSend" style="height:100%">
				</div>			
			</div>	
			
		</div>	
		
	</div>
	</body>
</html>