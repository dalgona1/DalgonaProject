public class Book 
{
	//���� ���� Ŭ����
	private int no;        //å��ȣ
	private String title;  //����
	private String author; //����
	private int have;      //���尹��
	private int rent;      //���ⰹ��
	private int remain;    //�ܿ�����
	
	//������
	Book(int no,String title,String author,int have)
	{
		this.no     = no;
		this.title  = title;
		this.author = author;
		this.have   = have;
		this.rent   = 0;
		this.remain = have; //�ܿ������� ���尹���� �����ϰ� ó��
	}
	
	void PrintInfo() //���������� ȭ�鿡 ����Ѵ�
	{
		System.out.println("��ȣ:" + no);
		System.out.println("����:" + title);
		System.out.println("����:" + author);
		System.out.println("����:" + have);
		System.out.println("����:" + rent);
		System.out.println("�ܿ�:" + remain);
	}
	
	//���������� ó���Ѵ�
	//���ϰ�: true - ���⼺�� false - �������
	boolean DoRent(int count)
	{
		//�ܿ� < ���ⰹ�� : ����ȵ�
		if( remain < count)
		{
			//����ȵ�
			return false;
		}else
		{
			//����ó��
			rent = rent + count; //���ⰹ���� ������ �Ǽ���ŭ ���Ѵ�.
			remain = remain - count; //�ܿ��������� ������ �Ǽ���ŭ ����.
			return true;
		}
	}
	
	//�����ݳ��� ó���Ѵ�.
	boolean DoReturn(int count)
	{
		//���ⰹ�� >= �ݳ����� : �ݳ�ó��
		if(rent >= count)
		{
			rent = rent - count;
			remain = remain + count;
			return true;
		}else
		{
			return false;
		}
		
	}
	int getNo()
	{
		return this.no;
	}
}

