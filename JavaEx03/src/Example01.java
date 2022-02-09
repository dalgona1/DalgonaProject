public class Example01 
{
	public static void main(String[] args) 
	{	
		//0부터 10까지 합계를 구하는 프로그램
		int n = 0;
		int sum = 0;
				
		while( n <= 10 )
		{
			System.out.println("this is n :" + n);
			sum = sum + n;
			n = n + 1;
		}
		System.out.println("sum:" + sum);
	}
}
