public class Example02 
{
	public static void main(String[] args) 
	{	
		//0���� 10���� ¦�� �հ踦 ���ϴ� ���α׷�
		int n = 0;
		int even_sum = 0; //¦���� �հ�
		int odd_sum  = 0; //Ȧ������ �հ�
		
		while( n <= 10 )
		{
			if( (n % 2) == 0 )
			{
				even_sum = even_sum + n;
			}else
			{
				odd_sum = odd_sum + n;
			}
			n= n + 1;
		}		
		System.out.println("¦���� �հ��:" + even_sum);
		System.out.println("Ȧ���� �հ��:" + odd_sum);
	}
}
