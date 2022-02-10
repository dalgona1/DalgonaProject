import java.util.Scanner;
public class Example02 
{
	//도서대출관리 프로그램v0.2
	public static void main(String[] args) 
	{
		int bookno;
		int menuno;
		Library lib = new Library();
		Scanner sc = new Scanner(System.in);
		do
		{
			lib.PrintMenu();
			System.out.print("메뉴:");		
			menuno = sc.nextInt();		
			System.out.print("선택한 메뉴는 " + menuno + "입니다.");
			if( menuno == 1)
			{
				//도서목록
				lib.PrintList();
			}else if( menuno == 2)
			{
				//도서 대출
				System.out.print("도서번호:");
				bookno = sc.nextInt();
				lib.Rent(bookno);
				lib.PrintList();
				
			}else if( menuno == 3)
			{
				//도서 반납
				System.out.print("도서번호:");
				bookno = sc.nextInt();
				lib.Return(bookno);
				lib.PrintList();
			}else if( menuno == 4)
			{
				//종료
				break;
			}else
			{
				System.out.println("메뉴 선택이 잘못되었습니다.");
			}
		}while(true);
		System.out.println("===================");
		System.out.println("프로그램이 종료되었습니다.");
	}
}
