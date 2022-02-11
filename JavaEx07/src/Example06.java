public class Example06 
{
	public static void main(String[] args) 
	{
		int n;
		Cal c = new Cal();
		n = c.add(1, 1);
		n = c.minus(1, 1);
		n = c.mux(1, 1);
		n = c.divide(1, 1);
		
		n = Cal.add(1, 1);
		n = Cal.minus(1, 1);
		n = Cal.mux(1, 1);
		n = Cal.divide(1, 1);
	}
}
