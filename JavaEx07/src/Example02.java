import java.util.Scanner;
public class Example02 
{
	//����������� ���α׷�v0.2
	public static void main(String[] args) 
	{
		int bookno;
		int menuno;
		Library lib = new Library();
		Scanner sc = new Scanner(System.in);
		do
		{
			lib.PrintMenu();
			System.out.print("�޴�:");		
			menuno = sc.nextInt();		
			System.out.print("������ �޴��� " + menuno + "�Դϴ�.");
			if( menuno == 1)
			{
				//�������
				lib.PrintList();
			}else if( menuno == 2)
			{
				//���� ����
				System.out.print("������ȣ:");
				bookno = sc.nextInt();
				lib.Rent(bookno);
				lib.PrintList();
				
			}else if( menuno == 3)
			{
				//���� �ݳ�
				System.out.print("������ȣ:");
				bookno = sc.nextInt();
				lib.Return(bookno);
				lib.PrintList();
			}else if( menuno == 4)
			{
				//����
				break;
			}else
			{
				System.out.println("�޴� ������ �߸��Ǿ����ϴ�.");
			}
		}while(true);
		System.out.println("===================");
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
