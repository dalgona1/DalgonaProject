public class Example04 
{
	public static void main(String[] args) 
	{
		String s1 = "abcdefg";
		String s2 = "1234568";
		String s3 = "abcdefg";
		
		//참조하는 문자열 객체가 같은지 검사한다.
		boolean f = (s1 == s2);
		System.out.println(f);
		
		//두개의 문자열이 같은지 검사한다.
		f = s1.equals(s3);
		System.out.println(f);
	}
}
