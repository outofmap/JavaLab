package company;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tv tv = new Tv(); abstact class�� ������ �Ұ����� 
		
		Tv sTv = new SamsungTV();
		sTv.turnOn();
		
		Tv lgTv = new LGTV();
		lgTv.turnOn();
		
		
	}

}
