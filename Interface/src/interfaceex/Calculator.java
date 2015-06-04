package interfaceex;

public class Calculator implements ICalc {
	
	final int fine; //초기화를 안했음.
	
	public Calculator(int fine){
		this.fine = fine; 
		//blank final variable 초기화 하지 않고, 생성될 때 생성자에서 초기화.
	}

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		return x - y;
	}

	@Override
	public int multi(int x, int y) {
		return x * y;
	}

	@Override
	public int divide(int x, int y) {
		return x / y;
	}

}
