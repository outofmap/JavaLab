package template;

public abstract class AbstractDisplay {
	public int i = 100;
	
	public abstract void begin();

	public abstract void print();

	public abstract void end();
	
	//구현이 있지만,소스코드가 없는 method, abstract는 아니다.
	public void line(){}
	
	//template method : 하위 클래스가 template method를 재구현 할 수 없음.
	public final void display() {
		int i = 0;
		begin();

		for (i = 0; i < 5; i++) {
			print();
		}
		end();
		line(); // 원래 시나리오에서는 아무일도 일어나지않
	}
}
