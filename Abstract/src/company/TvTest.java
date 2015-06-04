package company;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tv tv = new Tv(); abstact class는 생성이 불가능함 
		
		Tv sTv = new SamsungTV();
		sTv.turnOn();
		
		Tv lgTv = new LGTV();
		lgTv.turnOn();
		
		
	}

}
