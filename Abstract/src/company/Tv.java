package company;

public abstract class Tv {
	
	int channelNum = 11;
	
	public void turnOn(){
		System.out.println("turn on ()");
	}
	
	public void turnOff(){
		System.out.println("turn Off()");
	}
	
	//���� �Ǿ��ִ� ��
	public abstract void channelUp();
	public abstract void channelDown();
	
}
