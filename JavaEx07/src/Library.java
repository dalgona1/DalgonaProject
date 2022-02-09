//���� ���� ���� Ŭ����
public class Library 
{
	private Book[] books =null;
	
	//������
	Library()
	{
		books = new Book[3];
		
		books[0] = new Book(1,"�̰��� �ڹٴ�.1��","ȫ�浿",2);
		books[1] = new Book(2,"�̰��� �ڹٴ�.2��","ȫ�浿",2);
		books[2] = new Book(3,"�̰��� �ڹٴ�.3��","ȫ�浿",2);	
	}
	
	//ȭ�� �޴� ���
	void PrintMenu()
	{
		System.out.println("���� �뿩���� ���α׷�V0.1");
		System.out.println("=======================");
		System.out.println("1. ������� ��ȸ");
		System.out.println("2. ��������");
		System.out.println("3. ����ݳ�");
		System.out.println("4. ���α׷� ����");
	}
	
	//������� ���
	void PrintList()
	{
		System.out.println("*****************");
		for(int i=0; i < books.length; i++)
		{
			books[i].PrintInfo();
			System.out.println("*****************");
		}
	}
	
	//������� ���
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
		
	//�����뿩 ó��
	void Rent(int bookno)
	{
		for(int i=0; i < books.length; i++)
		{
			if(bookno == books[i].getNo() )
			{
				if( books[i].DoRent(1) == true)
				{
					System.out.println("===> ����Ϸ�");
				}else
				{
					System.out.println("===> �������");
				}
				break;
			}
		}
	}
	
	//�����ݳ� ó��
	void Return(int bookno)
	{
		for(int i=0; i < books.length; i++)
		{
			if(bookno == books[i].getNo() )
			{
				if( books[i].DoReturn(1) == true)
				{
					System.out.println("===> �ݳ��Ϸ�");
				}else
				{
					System.out.println("===> �ݳ�����");
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