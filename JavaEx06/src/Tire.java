//Ÿ�̾� ������ �����ϴ� Ŭ����

public class Tire 
{
	private String product; //������
	private int    inch;    //��ġ
	
	//������
	Tire()
	{
		product = "��ȣŸ�̾�";
		inch = 19;
		
		System.out.println("�ڵ� ȣ�� �Ǿ����ϴ�.");
	}
	
	//������
	Tire(String name)
	{
		this.product = name;
		inch = 18;
	}

	public String getProduct() 
	{
		return product;
	}

	public void setProduct(String product) 
	{
		this.product = product;
	}

	public int getInch() 
	{
		return inch;
	}

	public void setInch(int inch) 
	{
		this.inch = inch;
	}
	
	public void Print()
	{
	System.out.println("������:" + this.product);
	System.out.println("��   ġ:" + this.inch);
	}
}