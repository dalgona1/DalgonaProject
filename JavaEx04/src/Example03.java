public class Example03 
{
	public static void main(String[] args) 
	{
		int a[] = { 1, 2 };
		int b[] = { 3, 4 };
		int c[] = null;
		
		//a�� �����ϴ� ��ü(���޸𸮿� �ִ� ������)�� c�� �����ϰ� �ȴ�.
		c = a;
		
		boolean f;
		f= (b == c ); //b�� c�� �����ϴ� ��ü�� �������� �˻��Ѵ�.
		System.out.println(f);
		
		f= (a == c ); //b�� c�� �����ϴ� ��ü�� �������� �˻��Ѵ�.
		System.out.println(f);
		
		//a = b;
		//c = null;
		
		
		//�迭�� �������� ����� �ڵ�
		int [] score = { 1 ,2 , 3, 4 };
		//score = { 1, 2, 3, 4 }; //������ ����
		score = new int[4]; //���ο� �迭 ������ ������ �����.
		//�����͸� �ʱ�ȭ(����)�Ѵ�.
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		
		//���ο� �迭������ ������ �����, �����͸� �ʱ�ȭ�Ѵ�.
		score = new int[] { 1, 2, 3, 4} ;
	}
}