//도서 대출 관리 클래스
public class Library 
{
	private Book[] books =null;
	
	//생성자
	Library()
	{
		books = new Book[3];
		
		books[0] = new Book(1,"이것이 자바다.1권","홍길동",2);
		books[1] = new Book(2,"이것이 자바다.2권","홍길동",2);
		books[2] = new Book(3,"이것이 자바다.3권","홍길동",2);	
	}
	
	//화면 메뉴 출력
	void PrintMenu()
	{
		System.out.println("도서 대여관리 프로그램V0.1");
		System.out.println("=======================");
		System.out.println("1. 도서목록 조회");
		System.out.println("2. 도서대출");
		System.out.println("3. 대출반납");
		System.out.println("4. 프로그램 종료");
	}
	
	//도서목록 출력
	void PrintList()
	{
		System.out.println("*****************");
		for(int i=0; i < books.length; i++)
		{
			books[i].PrintInfo();
			System.out.println("*****************");
		}
	}
	
	//도서목록 출력
		void PrintList(int bookno)
		{
			System.out.println("*****************");
			for(int i=0; i < books.length; i++)
			{
				if( bookno == books[i].getNo())
				{
					books[i].PrintInfo();
					System.out.println("*****************");
					break;
				}
				
			}
		}
		
	//도서대여 처리
	void Rent(int bookno)
	{
		for(int i=0; i < books.length; i++)
		{
			if(bookno == books[i].getNo() )
			{
				if( books[i].DoRent(1) == true)
				{
					System.out.println("===> 대출완료");
				}else
				{
					System.out.println("===> 대출실패");
				}
				break;
			}
		}
	}
	
	//도서반납 처리
	void Return(int bookno)
	{
		for(int i=0; i < books.length; i++)
		{
			if(bookno == books[i].getNo() )
			{
				if( books[i].DoReturn(1) == true)
				{
					System.out.println("===> 반납완료");
				}else
				{
					System.out.println("===> 반납실패");
				}
				break;
			}
		}
	}
	
	Book GetNewBook(int no,String title,String author,int have)
	{
		Book book = new Book(no,title,author,have);
		return book;
	}
}