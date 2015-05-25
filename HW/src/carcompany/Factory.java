package carcompany;

import java.util.ArrayList;
import java.util.List;

public class Factory {
	List<Car> carList = new ArrayList<Car>();

	public void make(String name, int number, int price) {

		for (int i = 0; i < number; i++) {
			if (name == "sonata") {
				Sonata s = new Sonata(price);
				carList.add(s);
			}

			if (name == "genesis") {
				Genesis g = new Genesis(price);
				carList.add(g);
			}

			if (name == "grandeur") {
				Grandeur gr = new Grandeur(price);
				carList.add(gr);
			}
		}
	}

	public List<Car> getCarList() {
		return carList;
	}

}
