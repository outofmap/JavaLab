package videoshop;

public class Videoshop extends Shop implements IQueue {

	@Override
	public void enQueue(String name) {
		shelf.add(name);
	}

	@Override
	public String deQueue() {
		
		return shelf.remove(0);
	}

}
