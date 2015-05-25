package date;

public class TestCheckDate {

	public static void main(String[] args) {
		 CheckDate cal = new CheckDate();
		 cal.setDMY(2015, 2, 29);
		 cal.printDMY();
		 cal.vaildDate(cal.getYear(), cal.getMonth(), cal.getDate());

	}

}
