public class Car
{
	public String name;
	
	Car(String name)
	{
		this.name = name;
	}
	
	void PrintCar()
	{
		System.out.println("����:" + name);
	}
	
	public Tire MakeTire()
	{
		Tire t = new Tire(); 
		return t;
	}
}



