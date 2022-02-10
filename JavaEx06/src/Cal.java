//초간단 계산기 클래스
public class Cal 
{
	void Info()
	{
		System.out.println("Cal Info.class...");
	}
	
	void Set(int x)
	{
		System.out.println("x=" + x);
	}
	
	void mul(int x,int y)
	{
		int n = x * y;
		System.out.println(x + " x " + y + "=" + n);
	}
	
	void mullist(int x)
	{
		for(int i=1; i <=9; i++)
		{
			int n = x * i;
			System.out.println(x + " x " + i + "=" + n);
		}
	}
	
	int add(int x,int y)
	{
		int n = x + y;
		return n;
	}
	
	int minus(int x,int y)
	{
		int n = x - y;
		return n;
	}
	
	int mux(int x,int y)
	{
		int n = x * y;
		return n;
	}
	
	int divide(int x,int y)
	{	
		if(y != 0)
		{
			int n = x / y;
			return n;
		}else
		{
			return 0;
		}
	}
	
	int doCal(int x,int y,String op)
	{
		int result = 0;
		switch(op)
		{
		case "+":
			result = add(x, y);
			break;
		case "-":
			result = minus(x, y);
			break;
		case "*":
			result = mux(x, y);
			break;
		case "/":
			result = divide(x, y);
			break;
			default:
			result = 0;
			break;
		}
		return result;
	}
}