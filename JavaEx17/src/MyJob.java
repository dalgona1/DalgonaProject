public class MyJob extends Thread
{
	@Override
	public void run()
	{
		System.out.println("asd");
		PrintJob();
		
		
	}
	
	public void PrintJob()
	{
		for(int i =1; i <= 10; i++)
		{
			System.out.println("my : i=" + i);
			try
			{
			Thread.sleep(200);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
