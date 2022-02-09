public class Example07 
{
	//0~60점 : F학점
	//60 ~ 70 : D학점
	//70 ~ 80 : C학점
	//80 ~ 90 : B학점
	//90 ~ 100 : A학점
	
	public static void main(String[] args) 
	{
		int score = 88;
		String grade = "";
		if( score >= 90)
		{
			grade = "A";
		}else if (score >= 80 && score < 90 )
		{
			grade = "B";
		}
		System.out.println(grade);
	}
}
