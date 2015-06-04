package interfaceex;

public class CalculateTest {

	public static void main(String[] args) {
		//Calculators´Â ICalc typeÀÌ°í 
		
		int x = 10;
		int y = 2;
		
		ICalc calc = new Calculator(100);
		
		System.out.println(calc.add(x, y));
		System.out.println(calc.divide(x, y));
		System.out.println(calc.multi(x, y));
		System.out.println(calc.sub(x, y));
		
		//IClac clacnew = new ICalcNew();
	}

}
