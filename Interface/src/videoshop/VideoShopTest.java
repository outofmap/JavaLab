package videoshop;

public class VideoShopTest {

	public static void main(String[] args) {
		IQueue vShop = new Videoshop();
		vShop.enQueue("�¹���1");
		vShop.enQueue("�¹���2");
		vShop.enQueue("�¹���3");
		
		System.out.println(vShop.deQueue());
		System.out.println(vShop.deQueue());
		System.out.println(vShop.deQueue());
	}

}
