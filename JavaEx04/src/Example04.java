public class Example04 
{
	public static void main(String[] args) 
	{
		String s1 = "abcdefg";
		String s2 = "1234568";
		String s3 = "abcdefg";
		
		//�����ϴ� ���ڿ� ��ü�� ������ �˻��Ѵ�.
		boolean f = (s1 == s2);
		System.out.println(f);
		
		//�ΰ��� ���ڿ��� ������ �˻��Ѵ�.
		f = s1.equals(s3);
		System.out.println(f);
	}
}
