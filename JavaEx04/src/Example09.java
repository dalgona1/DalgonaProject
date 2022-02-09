public class Example09 
{

	public static void main(String[] args) 
	{
		TrafficLight tr = TrafficLight.RED_LIGHT;
		
		switch(tr)
		{
		case RED_LIGHT:
			System.out.println("»¡°£»ö");
			break;
		case GREEN_LIGHT:
			System.out.println("³ì»ö");
			break;
		case YELLOW_LIGHT:
			System.out.println("ÁÖÈ²»ö");
			break;
		}
		
		int mytr = 0;
		switch(mytr)
		{
		case 0:
			System.out.println("»¡°£»ö");
			break;
		case 1:
			System.out.println("³ì»ö");
			break;
		case 2:
			System.out.println("ÁÖÈ²»ö");
			break;		
		}
	}
}
