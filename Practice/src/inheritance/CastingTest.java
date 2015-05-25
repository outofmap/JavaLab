package inheritance;

public class CastingTest {

public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; 	//car를 Car타입에서 FireEngine타입으로 변환. 그냥 대입해도 ok.
		//car.water();
		fe2 = (FireEngine)car;
		fe2.water();
		}
}

class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("부릉부릉 드라이브");
	}
	void stop(){
		System.out.println("stop!!!!");
	}
	
}

class FireEngine extends Car{
	void water(){
		System.out.println("water!!!!");
	}
}