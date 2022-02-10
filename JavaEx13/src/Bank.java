import java.util.Scanner;

public class Bank 
{
	private int balance;
	private Scanner scanner;
	
	Bank()
	{
		balance = 0;
		scanner = new Scanner(System.in);
	}
	private void PrintMenu() 
	{
		System.out.println("===========================");
		System.out.println("1. 예금, 2.출금, 3.잔고, 4.종료");
		System.out.println("===========================");
	}
	public void RunBank()
	{
		boolean run = true;
		
		int money;
		
		while(run)
		{
			PrintMenu();
			System.out.println("선택>");
			int menu = scanner.nextInt();
			if(menu == 1)
			{
				System.out.println("예금액>");
				money = scanner.nextInt();
				balance = balance + money;
			}else if(menu == 2)
			{
				System.out.println("출금액>");
				money = scanner.nextInt();
				if(money <= balance)
				{
					balance = balance - money;
				}else
				{
					System.out.println("잔액부족" + balance);
				}
				balance = balance - money;
			}else if(menu == 3)
			{
				System.out.println("잔고>" + balance);
			}else if(menu == 4)
			{
				run = false;
			}
		}
	}
}
