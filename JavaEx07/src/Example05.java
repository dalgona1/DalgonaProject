public class Example05 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle();
		System.out.println(c.pi);
		System.out.println(c.GetPI());
		
		System.out.println(Circle.pi);
		System.out.println(Circle.GetPI());
	}
}
