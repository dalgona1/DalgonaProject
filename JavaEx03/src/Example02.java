public class Example02 
{
	public static void main(String[] args) 
	{	
		//0부터 10까지 짝수 합계를 구하는 프로그램
		int n = 0;
		int even_sum = 0; //짝수의 합계
		int odd_sum  = 0; //홀수수의 합계
		
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
		System.out.println("짝수의 합계는:" + even_sum);
		System.out.println("홀수의 합계는:" + odd_sum);
	}
}
