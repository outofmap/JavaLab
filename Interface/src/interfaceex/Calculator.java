package interfaceex;

public class Calculator implements ICalc {
	
	final int fine; //�ʱ�ȭ�� ������.
	
	public Calculator(int fine){
		this.fine = fine; 
		//blank final variable �ʱ�ȭ ���� �ʰ�, ������ �� �����ڿ��� �ʱ�ȭ.
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
