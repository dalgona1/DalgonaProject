public class YourJob extends Thread
{
	@Override
	public void run()
	{
		System.out.println("your");
		PrintJob();
		
		
	}
	
	public void PrintJob()
	{
		for(int i =1; i <= 10; i++)
		{
			System.out.println("your: i=" + i);
			try
			{
			Thread.sleep(300);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}