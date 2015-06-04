package videoshop;

public class VideoShopTest {

	public static void main(String[] args) {
		IQueue vShop = new Videoshop();
		vShop.enQueue("ลยน้ป๊ธฦ1");
		vShop.enQueue("ลยน้ป๊ธฦ2");
		vShop.enQueue("ลยน้ป๊ธฦ3");
		
		System.out.println(vShop.deQueue());
		System.out.println(vShop.deQueue());
		System.out.println(vShop.deQueue());
	}

}
