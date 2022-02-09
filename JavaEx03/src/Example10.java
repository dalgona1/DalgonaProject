import java.util.Scanner;

public class Example10 
{
	//UP/DOWN게임 VERSION 0.1
	public static void main(String[] args) 
	{
		int count = 0;
		//1~100사이의 랜덤한 정수값을 만들어낸다.

		int hit = (int)((Math.random() * 100) % 100) +1;
		//System.out.println(hit);
		
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("숫자입력:");
			int n = sc.nextInt();
			System.out.println("당신이 입력한 숫자:" + n);
			
			//컴퓨터숫자(50) > 내꺼 숫자(10) : UP
			//컴퓨터숫자(50) < 내꺼 숫자(60) : DOWN
			//컴퓨터숫자(50) = 내꺼 숫자(5) : 정답!!
			if( hit > n)
			{
				//컴퓨터숫자(50) > 내꺼 숫자(10) : UP
				System.out.println("UP!!");
				count++;
			}else if( hit < n)
			{
				//컴퓨터숫자(50) < 내꺼 숫자(60) : DOWN
				System.out.println("DOWN!!");
				count++;
			}else
			{
				//컴퓨터숫자(50) = 내꺼 숫자(5) : 정답!!
				System.out.println("정답!!");
				break;
			}
			
			if( count >= 5)
			{
				System.out.println("GAME OVER!!!!");
				System.out.println("정답 :" + hit);
				break;
			}
		}while(true);
	}
}