package date;
//method�� �̸��� ���縦 �տ����°� ���ƿ�!
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
		System.out.println(year+"��"+month+"��"+date+"��");
	}
	
	public boolean checkLeapYear(int year){
		if((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0)
			return true;
		else
			return false;
	}
	
	public void vaildDate(int year,int month,int date)
	{
		//������ ���, 2�� 29�ϱ��� ��ȿ�ϴ�.
		if(checkLeapYear(year) == true){
			switch(month){
				case 1: case 3: case 5: case 7: case 8:
				case 10: case 12: 
					if(date <= 31){
						System.out.println("�����̰� ��ȿ�� ��¥�Դϴ�.");}
					else{
						System.out.println("��ȿ�� ��¥�� �ƴմϴ�.");}
					break;
				case 2:
					if(date <= 29){
						System.out.println("�����̰� ��ȿ�� ��¥�Դϴ�.");}
					else{
						System.out.println("��ȿ�� ��¥�� �ƴմϴ�.");}
					break;
				case 4: case 6: case 9: case 11:
					if(date <= 30){
						System.out.println("�����̰� ��ȿ�� ��¥�Դϴ�.");}
					else{
						System.out.println("��ȿ�� ��¥�� �ƴմϴ�.");}
					break;
			}
			
		}
		//����� ���, 1,3,5,7,8,10,12 �� 31�� �׿ܿ��� 30��, 2���� 28
		else
		{
			switch(month){
				case 1: case 3: case 5: case 7: case 8:
				case 10: case 12: 
					if(date <= 31){
						System.out.println("����̰� ��ȿ�� ��¥�Դϴ�.");}
					else{
						System.out.println("��ȿ�� ��¥�� �ƴմϴ�.");}
					break;
				
				case 2:
					if(date <= 28){
						System.out.println("����̰� ��ȿ�� ��¥�Դϴ�.");}
					else{
						System.out.println("��ȿ�� ��¥�� �ƴմϴ�.");}
					break;
					
				case 4: case 6: case 9: case 11:
					if(date <= 30){
						System.out.println("����̰� ��ȿ�� ��¥�Դϴ�.");}
					else{
						System.out.println("��ȿ�� ��¥�� �ƴմϴ�.");}
					break;
			}
		}
		
	}
}
