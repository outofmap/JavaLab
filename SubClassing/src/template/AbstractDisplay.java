package template;

public abstract class AbstractDisplay {
	public int i = 100;
	
	public abstract void begin();

	public abstract void print();

	public abstract void end();
	
	//������ ������,�ҽ��ڵ尡 ���� method, abstract�� �ƴϴ�.
	public void line(){}
	
	//template method : ���� Ŭ������ template method�� �籸�� �� �� ����.
	public final void display() {
		int i = 0;
		begin();

		for (i = 0; i < 5; i++) {
			print();
		}
		end();
		line(); // ���� �ó����������� �ƹ��ϵ� �Ͼ����
	}
}
