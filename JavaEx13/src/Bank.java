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
		System.out.println("1. ����, 2.���, 3.�ܰ�, 4.����");
		System.out.println("===========================");
	}
	public void RunBank()
	{
		boolean run = true;
		
		int money;
		
		while(run)
		{
			PrintMenu();
			System.out.println("����>");
			int menu = scanner.nextInt();
			if(menu == 1)
			{
				System.out.println("���ݾ�>");
				money = scanner.nextInt();
				balance = balance + money;
			}else if(menu == 2)
			{
				System.out.println("��ݾ�>");
				money = scanner.nextInt();
				if(money <= balance)
				{
					balance = balance - money;
				}else
				{
					System.out.println("�ܾ׺���" + balance);
				}
				balance = balance - money;
			}else if(menu == 3)
			{
				System.out.println("�ܰ�>" + balance);
			}else if(menu == 4)
			{
				run = false;
			}
		}
	}
}
