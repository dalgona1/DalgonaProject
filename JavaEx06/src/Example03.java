public class Example03 
{
	//메쏘드 작성 연습
	public static void main(String[] args) 
	{
		Cal c =new Cal();
		
		
		int x = 2;
		int y = 3;
		int result = 0;
		String op = "*";
		
		result = c.doCal(x, y, op);
		System.out.println(result);
		
		op = "/"; 
		result = c.doCal(x, y, op);
		System.out.println(x + op + y + "=" + result);
	}
}
