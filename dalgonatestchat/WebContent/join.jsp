<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>���� ���</title>
		<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<script>
		    function sample6_execDaumPostcode() {
		        new daum.Postcode({
		            oncomplete: function(data) {
		                // �˾����� �˻���� �׸��� Ŭ�������� ������ �ڵ带 �ۼ��ϴ� �κ�.

		                // �� �ּ��� ���� ��Ģ�� ���� �ּҸ� �����Ѵ�.
		                // �������� ������ ���� ���� ��쿣 ����('')���� �����Ƿ�, �̸� �����Ͽ� �б� �Ѵ�.
		                var addr = ''; // �ּ� ����
		                var extraAddr = ''; // �����׸� ����

		                //����ڰ� ������ �ּ� Ÿ�Կ� ���� �ش� �ּ� ���� �����´�.
		                //0 == '0' => true
		                //0 === '0' => false(���ĵ� �Ǻ�)
		                if (data.userSelectedType === 'R') { // ����ڰ� ���θ� �ּҸ� �������� ���
		                    addr = data.roadAddress;
		                } else { // ����ڰ� ���� �ּҸ� �������� ���(J)
		                    addr = data.jibunAddress;
		                }

		                // ����ڰ� ������ �ּҰ� ���θ� Ÿ���϶� �����׸��� �����Ѵ�.
		                if(data.userSelectedType === 'R'){
		                    // ���������� ���� ��� �߰��Ѵ�. (�������� ����)
		                    // �������� ��� ������ ���ڰ� "��/��/��"�� ������.
		                    if(data.bname !== '' && /[��|��|��]$/g.test(data.bname)){
		                        extraAddr += data.bname;
		                    }
		                    // �ǹ����� �ְ�, ���������� ��� �߰��Ѵ�.
		                    if(data.buildingName !== '' && data.apartment === 'Y'){
		                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
		                    }
		                    // ǥ���� �����׸��� ���� ���, ��ȣ���� �߰��� ���� ���ڿ��� �����.
		                    if(extraAddr !== ''){
		                        extraAddr = ' (' + extraAddr + ')';
		                    }
		                    // ���յ� �����׸��� �ش� �ʵ忡 �ִ´�.
		                    document.getElementById("sample6_extraAddress").value = extraAddr;
		                
		                } else {
		                    document.getElementById("sample6_extraAddress").value = '';
		                }

		                // �����ȣ�� �ּ� ������ �ش� �ʵ忡 �ִ´�.
		                document.getElementById('sample6_postcode').value = data.zonecode;
		                document.getElementById("sample6_address").value = addr;
		                // Ŀ���� ���ּ� �ʵ�� �̵��Ѵ�.
		                document.getElementById("sample6_detailAddress").focus();
		            }
		        }).open();
		    }
			</script>
	</head>
	<body>
		<style>
			.section input[id*="slide"]{
					display:none;
				}
				.section .slidewrap{
					max-width:1280px;
					margin:0 auto;
					overflow:hidden;
				}
				.section .slidelist{
					white-space:nowrap;	
				}
				.section .slidelist > li{
					display:inline-block;
					vertical-align:middle;
					width:120%;
					transition:all .5s;
				}
				.div{
				}
				.section .slidelist > li > a{
					display:block;
					position:relative;
					left:24%;
				}
				.section .slidelist > li > a > div{
					display:inline-block;
					border:solid 1px;
					width:500px;
					height:900px;
				}
				.section .slidelist > li > a > p{
					width:30px;
					display:inline-block;
					border:solid 1px;
				}
				.section .slidelist > li > a > label
				{
					position:absolute;
					z-index:10;
					top:50%;
					transform:translateY(-50%);
					padding:50px;
					cursor:pointer;			
				}
				.section .slidelist .left{
					left:-270px; 
					background:url('image/left.png')center center / 100% no-repeat;
				}
				.section .slidelist .right{
					right:715px;
					background:url('image/right.png')center center / 100% no-repeat;
				}
				.section [id="slide01"]:checked ~ .slidewrap .slidelist > li {transform:translateX(0.4%);}
				.section [id="slide02"]:checked ~ .slidewrap .slidelist > li {transform:translateX(-100%);}
				.section [id="slide03"]:checked ~ .slidewrap .slidelist > li {transform:translateX(-200.3%);}
				.section .slidelist > li > a >p{
				}
		</style>
		<form name="info" action="<%= request.getContextPath() %>/member/join.do" method="post">
			<div class="section">
			<input type="radio" name="slide" id="slide01" checked>
			<input type="radio" name="slide" id="slide02" >
			<input type="radio" name="slide" id="slide03" >
			<div class="slidewrap" >
				<ul class="slidelist">
					<li>
						<a>
							<div>
								<center>
									<div style="border:solid 1px; height:100px;"><img style="width:50px; margin-top:20px" src="image/close.png"></div>
									<div>
										<input type="text" name="User_Id" placeholder="����� ���̵�" style="width:80%; height:50px; font-size:20px;margin-top:25px">
									</div>
									<div style="margin-right:270px; margin-top:10px">
										<span >���̵� üũ</span>
									</div>
									<div>
										<input type="password" name="User_Pw" placeholder="��й�ȣ" style="width:80%; height:50px; font-size:20px;margin-top:15px">
									</div>
									<div>
										<input type="password" name="User_Pwc" placeholder="��й�ȣ Ȯ��" style="width:80%; height:50px; font-size:20px;margin-top:25px">
									</div>
									<div style="margin-right:270px; margin-top:10px">
										<span >��й�ȣ üũ</span>
									</div>
									<div>
										<input type="text" name="User_Car" placeholder="������ȣ" style="width:80%; height:50px; font-size:20px;margin-top:25px">
									</div>
								</center>
							</div>
							<label for="slide02" class="right"></label>
						</a>
					</li>
					<li>
						<a>
							<label for="slide01" class="left" ></label>
								<div>
									<center>
										<div>
											<input type="text" name="User_Kr" placeholder="�̸�(����)" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="text" name="User_Ch" placeholder="�̸�(�ѹ�)" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="text" name="User_Pno" placeholder="�ֹε�Ϲ�ȣ" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="text" name="User_Gen" placeholder="����" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<div>
												<input type="text" id="sample6_postcode" placeholder="�����ȣ" style="height:30px; width:60%; margin-top:25px; font-size:20pxfont-size:20px">
												<input type="button" onclick="sample6_execDaumPostcode()" value="�����ȣ ã��" style="width:20%"><br>
											</div>										
											<div>
												<input type="text" name="User_Add" id="sample6_address" placeholder="�ּ�"style="height:30px; width:60%; margin-top:25px; font-size:20pxfont-size:20px"><br>
											</div>
											<div>
												<input type="text" id="sample6_detailAddress" placeholder="���ּ�"style="height:30px; width:60%; margin-top:25px; font-size:20pxfont-size:20px">
											</div>
											<div>
												<input type="text" id="sample6_extraAddress" placeholder="�����׸�"style="height:30px; width:60%; margin-top:25px; font-size:20pxfont-size:20px">
											</div>
										</div>
										<div>
											<input type="text" name="User_Cm" placeholder="����" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="text" name="User_Kg" placeholder="ü��" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="text" name="User_Sh" placeholder="�÷�" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="text" name="User_Bt" placeholder="������" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
									</center>
								</div>
							<label for="slide03" class="right"></label>
						</a>
					</li> 
					<li>
						<a>
							<label for="slide02" class="left" ></label>
								<div>
									<center>
										<div>
											<input type="text" name="User_Color" placeholder="����" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="text" name="" placeholder="����" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="file" style="font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="text" name="User_Fs" placeholder="�����з�" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="text" name="User_Ca" placeholder="���1" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="text" name="career2" placeholder="���2" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="text" name="User_li" placeholder="�ڰ���1" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="text" name="license2" placeholder="�ڰ���2" style="width:80%; height:50px; font-size:20px;margin-top:25px">
										</div>
										<div>
											<input type="submit" value="�ۼ��Ϸ�" style="font-size:20px;background-color:#31B5FF;margin-top:50px; width:350px;height:70px;">
										</div>
									</center>
								</div>
						</a>
					</li> 
				</ul>
			</div>
		</div>
	</form>
	</body>
</html>