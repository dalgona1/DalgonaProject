import java.util.Scanner;

public class Example10 
{
	//UP/DOWN���� VERSION 0.1
	public static void main(String[] args) 
	{
		int count = 0;
		//1~100������ ������ �������� ������.

		int hit = (int)((Math.random() * 100) % 100) +1;
		//System.out.println(hit);
		
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("�����Է�:");
			int n = sc.nextInt();
			System.out.println("����� �Է��� ����:" + n);
			
			//��ǻ�ͼ���(50) > ���� ����(10) : UP
			//��ǻ�ͼ���(50) < ���� ����(60) : DOWN
			//��ǻ�ͼ���(50) = ���� ����(5) : ����!!
			if( hit > n)
			{
				//��ǻ�ͼ���(50) > ���� ����(10) : UP
				System.out.println("UP!!");
				count++;
			}else if( hit < n)
			{
				//��ǻ�ͼ���(50) < ���� ����(60) : DOWN
				System.out.println("DOWN!!");
				count++;
			}else
			{
				//��ǻ�ͼ���(50) = ���� ����(5) : ����!!
				System.out.println("����!!");
				break;
			}
			
			if( count >= 5)
			{
				System.out.println("GAME OVER!!!!");
				System.out.println("���� :" + hit);
				break;
			}
		}while(true);
	}
}