package company;

public abstract class Tv {
	
	int channelNum = 11;
	
	public void turnOn(){
		System.out.println("turn on ()");
	}
	
	public void turnOff(){
		System.out.println("turn Off()");
	}
	
	//선언만 되어있는 상
	public abstract void channelUp();
	public abstract void channelDown();
	
}
