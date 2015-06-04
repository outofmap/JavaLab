package videoshop;

public interface IQueue {
	void enQueue(String name); 		//맨 뒤
	String deQueue(); // 맨 앞에서 꺼내기
}
