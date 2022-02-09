
//자동차 정보를 관리하기 위한 클래스
public class Car 
{
	int  speed;      //속도
	Tire frontLeft;  //앞 왼쪽 바퀴
	Tire frontRight; //앞 오른쪽 바퀴
	Tire reaLeft;    //뒤 왼쪽 바퀴
	Tire reaRight;   //뒤 오른쪽 바퀴
	
	//생성자
	Car()
	{
		System.out.println("Car 생성자 호출이 되었습니다.");
		
		speed = 0; //자동차가 만들어질때 속도를 일단 제로로 시작하겠다.
		
		frontLeft  = new Tire();
		frontRight = new Tire();
		reaLeft    = new Tire();
		reaRight   = new Tire();
	}
	
	//속도를 올린다.
	void SpeedUp()
	{
		speed = speed + 1;
	}
	
	//속도를 낮춘다.
	void SpeedDown()
	{
		speed = speed - 1;
	}
	
}
