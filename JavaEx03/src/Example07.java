public class Example07 
{
	public static void main(String[] args) 
	{
		//구구단을 출력하는 프로그램
		for(int i= 1; i <= 9; i+=2)
		{
			for(int j= 1; j <= 9; j+=2)
			{
				System.out.println(i + "x" + j + "=" + (i*j));
				j++;
			}
		}
	}

}
