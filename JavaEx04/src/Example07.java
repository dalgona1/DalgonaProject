public class Example07 
{
	//0~60�� : F����
	//60 ~ 70 : D����
	//70 ~ 80 : C����
	//80 ~ 90 : B����
	//90 ~ 100 : A����
	
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
