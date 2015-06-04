package videoshop;

import java.util.ArrayList;

public class Shop {
	protected ArrayList<String> shelf = new ArrayList<String>();
	
	public int getCount(){
		return shelf.size();
	}
}
