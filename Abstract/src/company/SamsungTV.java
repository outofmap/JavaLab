package company;

public class SamsungTV extends Tv{

	@Override
	public void channelUp() {
		channelNum++;	
	}

	@Override
	public void channelDown() {
		channelNum--;
	}
	
	

}
