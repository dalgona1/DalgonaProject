public class Example09 
{

	public static void main(String[] args) 
	{
		TrafficLight tr = TrafficLight.RED_LIGHT;
		
		switch(tr)
		{
		case RED_LIGHT:
			System.out.println("������");
			break;
		case GREEN_LIGHT:
			System.out.println("���");
			break;
		case YELLOW_LIGHT:
			System.out.println("��Ȳ��");
			break;
		}
		
		int mytr = 0;
		switch(mytr)
		{
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("���");
			break;
		case 2:
			System.out.println("��Ȳ��");
			break;		
		}
	}
}
