public class Example08 
{
	public static void main(String[] args) 
	{
		int [] score = { 99 ,88, 77, 66 };
		
		/*int i = 0;
		System.out.println(score.length);
		for(i=0; i < score.length; i++)
		{	
			System.out.println(score[i]);
		*/
		for(int item : score)
		{
			System.out.println(item);
		}
	}
}
