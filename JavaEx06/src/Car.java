
//�ڵ��� ������ �����ϱ� ���� Ŭ����
public class Car 
{
	int  speed;      //�ӵ�
	Tire frontLeft;  //�� ���� ����
	Tire frontRight; //�� ������ ����
	Tire reaLeft;    //�� ���� ����
	Tire reaRight;   //�� ������ ����
	
	//������
	Car()
	{
		System.out.println("Car ������ ȣ���� �Ǿ����ϴ�.");
		
		speed = 0; //�ڵ����� ��������� �ӵ��� �ϴ� ���η� �����ϰڴ�.
		
		frontLeft  = new Tire();
		frontRight = new Tire();
		reaLeft    = new Tire();
		reaRight   = new Tire();
	}
	
	//�ӵ��� �ø���.
	void SpeedUp()
	{
		speed = speed + 1;
	}
	
	//�ӵ��� �����.
	void SpeedDown()
	{
		speed = speed - 1;
	}
	
}
