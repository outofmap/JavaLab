package carcompany;

import java.util.List;

public class Calculate {
	
	 public static int cal(Car[] CarList){
		
		int i;
		int total = 0;
		
		for(i=0; i<CarList.length; i++){
			
			
			if(CarList[i] instanceof Sonata){
				Car c = (Sonata)CarList[i];
				total += CarList[i].price * CarList[i].number;
			}
			
			else if(CarList[i] instanceof Genesis){
				Car c = (Genesis)CarList[i];
				total += CarList[i].price * CarList[i].number;
			}
			
			else if(CarList[i] instanceof Grandeur){
				Car c = (Grandeur)CarList[i];
				total += CarList[i].price * CarList[i].number;
			}
		
		}
		
		return total;
	 }
	 
	 public static int cal(List<Car> carList){
		 int i;
			int total = 0;
			
			for(i=0; i<carList.size(); i++){
				
				
				if(carList.get(i) instanceof Sonata){
					Car c = (Sonata)carList.get(i);
					total += carList.get(i).price;
				}
				
				else if(carList.get(i) instanceof Genesis){
					Car c = (Genesis)carList.get(i);
					total += carList.get(i).price;
				}
				
				else if(carList.get(i) instanceof Grandeur){
					Car c = (Grandeur)carList.get(i);
					total += carList.get(i).price;
				}
			
			}
			
			return total;
		 
		 
	 }
}
