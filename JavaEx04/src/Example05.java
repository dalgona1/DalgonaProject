public class Example05 
{
	public static void main(String[] args) 
	{
		//1차원 배열
		int [] score = { 10, 20, 30 };
		//2차원 배열
		int [][] data = 
			{
					{ 11, 22, 33 },
					{ 44, 55, 66 }
			};
		
		int []k = data[0];
		for(int i=0; i<k.length; i++)
		{
			System.out.println(k[i]);
		}
	}
}
