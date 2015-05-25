package date;
//method의 이름은 동사를 앞에쓰는게 좋아요!
public class CheckDate {
	private int year;
	private int month;
	private int date;
	
	public void setDMY(int year,int month,int date)
	{
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	public void printDMY(){
		System.out.println(year+"년"+month+"월"+date+"일");
	}
	
	public boolean checkLeapYear(int year){
		if((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0)
			return true;
		else
			return false;
	}
	
	public void vaildDate(int year,int month,int date)
	{
		//윤년인 경우, 2월 29일까지 유효하다.
		if(checkLeapYear(year) == true){
			switch(month){
				case 1: case 3: case 5: case 7: case 8:
				case 10: case 12: 
					if(date <= 31){
						System.out.println("윤년이고 유효한 날짜입니다.");}
					else{
						System.out.println("유효한 날짜가 아닙니다.");}
					break;
				case 2:
					if(date <= 29){
						System.out.println("윤년이고 유효한 날짜입니다.");}
					else{
						System.out.println("유효한 날짜가 아닙니다.");}
					break;
				case 4: case 6: case 9: case 11:
					if(date <= 30){
						System.out.println("윤년이고 유효한 날짜입니다.");}
					else{
						System.out.println("유효한 날짜가 아닙니다.");}
					break;
			}
			
		}
		//평년인 경우, 1,3,5,7,8,10,12 는 31일 그외에는 30일, 2월은 28
		else
		{
			switch(month){
				case 1: case 3: case 5: case 7: case 8:
				case 10: case 12: 
					if(date <= 31){
						System.out.println("평년이고 유효한 날짜입니다.");}
					else{
						System.out.println("유효한 날짜가 아닙니다.");}
					break;
				
				case 2:
					if(date <= 28){
						System.out.println("평년이고 유효한 날짜입니다.");}
					else{
						System.out.println("유효한 날짜가 아닙니다.");}
					break;
					
				case 4: case 6: case 9: case 11:
					if(date <= 30){
						System.out.println("평년이고 유효한 날짜입니다.");}
					else{
						System.out.println("유효한 날짜가 아닙니다.");}
					break;
			}
		}
		
	}
}
