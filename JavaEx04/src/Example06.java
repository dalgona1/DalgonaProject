public class Example06 
{
	public static void main(String[] args) 
	{
		int score[] = null;
		score = new int[4];
		score[0] = 100; 
		score[1] = 90; 
		score[2] = 80; 
		score[3] = 70; 
		
		System.out.println("배열 원소 갯수 :" + score.length);
		for(int i=0; i<score.length; i++)
		{
		System.out.println(score[i]);	
		}
	}

}
