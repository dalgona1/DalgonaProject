import java.util.Scanner;

public class Example11 
{
	//UP/DOWN���� VERSION 0.2
	public static void main(String[] args) 
	{
		//�ִ� ���� Ƚ��
		int maxtry = 5;
		//�ִ� ����
		int maxrange = 50;
		
		//1~100������ ������ �������� ������.
		int hit = (int)((Math.random() * 100) % 100) +1;
		System.out.println(hit);

		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i <= maxtry; i++)
		{
			System.out.println( (maxtry - i) + "ȸ ���ҽ��ϴ�.");
			System.out.println("�����Է�:");
			int n = sc.nextInt();
			System.out.println("����� �Է��� ����:" + n);
				
			//��ǻ�ͼ���(50) > ���� ����(10) : UP
			//��ǻ�ͼ���(50) < ���� ����(60) : DOWN
			//��ǻ�ͼ���(50) = ���� ����(5) : ����!!
			if(hit > n)
			{
				//��ǻ�ͼ���(50) > ���� ����(10) : UP
				System.out.println("UP!!");
			}else if(hit < n)
			{
				//��ǻ�ͼ���(50) < ���� ����(60) : DOWN
				System.out.println("DOWN!!");
			}else
			{
				//��ǻ�ͼ���(50) = ���� ����(5) : ����!!
				System.out.println("����!!");
				break;
			}
		}
		System.out.println("������ ����Ǿ����ϴ�.");
	}
}
