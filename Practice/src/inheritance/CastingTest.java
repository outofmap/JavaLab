package inheritance;

public class CastingTest {

public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; 	//car�� CarŸ�Կ��� FireEngineŸ������ ��ȯ. �׳� �����ص� ok.
		//car.water();
		fe2 = (FireEngine)car;
		fe2.water();
		}
}

class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("�θ��θ� ����̺�");
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