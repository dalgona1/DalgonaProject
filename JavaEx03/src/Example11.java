import java.util.Scanner;

public class Example11 
{
	//UP/DOWN게임 VERSION 0.2
	public static void main(String[] args) 
	{
		//최대 도전 횟수
		int maxtry = 5;
		//최대 범위
		int maxrange = 50;
		
		//1~100사이의 랜덤한 정수값을 만들어낸다.
		int hit = (int)((Math.random() * 100) % 100) +1;
		System.out.println(hit);

		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i <= maxtry; i++)
		{
			System.out.println( (maxtry - i) + "회 남았습니다.");
			System.out.println("숫자입력:");
			int n = sc.nextInt();
			System.out.println("당신이 입력한 숫자:" + n);
				
			//컴퓨터숫자(50) > 내꺼 숫자(10) : UP
			//컴퓨터숫자(50) < 내꺼 숫자(60) : DOWN
			//컴퓨터숫자(50) = 내꺼 숫자(5) : 정답!!
			if(hit > n)
			{
				//컴퓨터숫자(50) > 내꺼 숫자(10) : UP
				System.out.println("UP!!");
			}else if(hit < n)
			{
				//컴퓨터숫자(50) < 내꺼 숫자(60) : DOWN
				System.out.println("DOWN!!");
			}else
			{
				//컴퓨터숫자(50) = 내꺼 숫자(5) : 정답!!
				System.out.println("정답!!");
				break;
			}
		}
		System.out.println("게임이 종료되었습니다.");
	}
}
