public class Book 
{
	//도서 정보 클래스
	private int no;        //책번호
	private String title;  //제목
	private String author; //저자
	private int have;      //소장갯수
	private int rent;      //대출갯수
	private int remain;    //잔여갯수
	
	//생성자
	Book(int no,String title,String author,int have)
	{
		this.no     = no;
		this.title  = title;
		this.author = author;
		this.have   = have;
		this.rent   = 0;
		this.remain = have; //잔여갯수는 소장갯수와 동일하게 처리
	}
	
	void PrintInfo() //도서정보를 화면에 출력한다
	{
		System.out.println("번호:" + no);
		System.out.println("제목:" + title);
		System.out.println("저자:" + author);
		System.out.println("소장:" + have);
		System.out.println("대출:" + rent);
		System.out.println("잔여:" + remain);
	}
	
	//도서대출을 처리한다
	//리턴값: true - 대출성공 false - 대출실패
	boolean DoRent(int count)
	{
		//잔여 < 대출갯수 : 대출안됨
		if( remain < count)
		{
			//대출안됨
			return false;
		}else
		{
			//대출처리
			rent = rent + count; //대출갯수에 대출한 권수만큼 더한다.
			remain = remain - count; //잔여갯수에서 대출한 권수만큼 뺀다.
			return true;
		}
	}
	
	//도서반납을 처리한다.
	boolean DoReturn(int count)
	{
		//대출갯수 >= 반납갯수 : 반납처리
		if(rent >= count)
		{
			rent = rent - count;
			remain = remain + count;
			return true;
		}else
		{
			return false;
		}
		
	}
	int getNo()
	{
		return this.no;
	}
}

