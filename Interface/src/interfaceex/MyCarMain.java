package interfaceex;

interface IFork{
	void dig();
}

interface ITank{
	void shoot();
}

abstract class AutoCar{
	abstract void drive();
	
}

class MyCar extends AutoCar implements IFork, ITank{

	@Override
	public void shoot() {
		System.out.println("shoot()");
	}

	@Override
	public void dig() {
		System.out.println("dig()");
	}

	@Override
	void drive() {
		System.out.println("drive()");
	}
	void sound(){
		System.out.println("sound()");
	}
	
}

public class MyCarMain {

	public static void main(String[] args) {
		
		MyCar mCar = new MyCar();
		
		mCar.dig();
		mCar.drive();
		mCar.shoot();
		mCar.sound();
		
		IFork f = mCar;
		f.dig();
		
		ITank t = mCar;
		t.shoot();
		

	}

}
