
public class ary 
{
	public static void main(String[] args) 
	{
		String s = null;
		ArrayList<String> ary = new ArrayList<String>();
		for(int i = 1; i <= 5; i++)
		{
			s = String.format("%02d번째 데이터",i);
			ary.add(s);
		}
		for(String x : ary)
		{
			System.out.println(x);
		}
	}
}
