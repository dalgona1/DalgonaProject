public class ThreadTest 
{
	public static void main(String[] args) 
	{
		MyJob myjob = new MyJob();
		YourJob yourjob = new YourJob();
		
		myjob.start();
		yourjob.start();
		
		System.out.println("main is done......");//µÙ∑π¿Ã
	}
}
