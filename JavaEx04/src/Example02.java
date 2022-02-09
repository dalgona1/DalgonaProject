public class Example02 
{
	public static void main(String[] args) 
	{
		//정적 데이터 선언
		//int score[] = { 1, 2, 3, 4 };  
		
		//동적 데이터 선언
		int score[] = null;
		score = new int[4];
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		
		System.out.println("배열 원소 갯수 :" + score.length);
		for(int i=0; i <score.length; i++)
		{
		System.out.println(score[i]);
		}
		
		//myscore에 score가 참조하는 객체를 지정하는 코드
		int myscore[] = null;
		myscore = score; //대입했기 때문에 값이 같아짐
		score[0] = 99;
		System.out.println(myscore[0]);
	}
}