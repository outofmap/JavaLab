package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SysteminTest {
	public static void main(String [] args){
		
		System.out.println("�Է� �� '��' ������~~~");
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			// System.in.read()�� 1����Ʈ�� �д´�.
			
			int i;
			while((i = isr.read()) !='��'){
				System.out.print((char)i);
				//int i = System.in.read();
				//i = System.in.read();
			
			}
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
