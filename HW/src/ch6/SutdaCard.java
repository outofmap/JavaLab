package ch6;

public class SutdaCard {
	int num; 			// ī���� ���� 1~10������ ����
	boolean isKwang; 	// ���̸� true,�ƴϸ� false 1,3,8�� 

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public SutdaCard() {
		this(1,true);
	}

	public String info(){
		return num + (isKwang? "K":"");
		
	}
	
}


 