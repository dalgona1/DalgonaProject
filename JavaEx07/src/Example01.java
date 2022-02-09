import java.util.Scanner;
public class Example01 
{
	public static void main(String[] args) 
	{
		//도서대출관리 프로그램v0.1
		Book[] books = null;
		books = new Book[3];
		books[0] = new Book(1,"이것이 자바다.1권","홍길동",2);
		books[1] = new Book(2,"이것이 자바다.2권","홍길동",2);
		books[2] = new Book(3,"이것이 자바다.3권","홍길동",2);
		
		Scanner sc = new Scanner(System.in);
		int menuno;
		int bookno;
		boolean iscontinue =true;
		do
		{
			System.out.println("도서 대여관리 프로그램V0.1");
			System.out.println("=======================");
			System.out.println("1. 도서목록 조회");
			System.out.println("2. 도서대출");
			System.out.println("3. 대출반납");
			System.out.println("4. 프로그램 종료");
			System.out.print("메뉴:");		
			menuno = sc.nextInt();		
			System.out.print("선택한 메뉴는 " + menuno + "입니다.");
			
			switch(menuno)
			{
			case 1: //도서목록 출력
				System.out.println("*****************");
				for(int i=0; i < books.length; i++)
				{
					books[i].PrintInfo();
					System.out.println("*****************");
				}
				break;
			case 2: //도서대출
				System.out.print("도서번호:");
				bookno = sc.nextInt();
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
				break;
			case 3: //대출반납
				System.out.print("도서번호:");
				bookno = sc.nextInt();
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
				
				break;
			case 4: 
				iscontinue = false;
				break;
			default:
				System.out.println("메뉴 선택이 잘못되었습니다.");
				break;
			}
		
		}while(iscontinue);
		
		System.out.println("===================");
		System.out.println("프로그램이 종료되었습니다.");
	}
}