public class Example02 
{
	public static void main(String[] args) 
	{
		//���� ������ ����
		//int score[] = { 1, 2, 3, 4 };  
		
		//���� ������ ����
		int score[] = null;
		score = new int[4];
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		
		System.out.println("�迭 ���� ���� :" + score.length);
		for(int i=0; i <score.length; i++)
		{
		System.out.println(score[i]);
		}
		
		//myscore�� score�� �����ϴ� ��ü�� �����ϴ� �ڵ�
		int myscore[] = null;
		myscore = score; //�����߱� ������ ���� ������
		score[0] = 99;
		System.out.println(myscore[0]);
	}
}