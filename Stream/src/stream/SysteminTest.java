package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SysteminTest {
	public static void main(String [] args){
		
		System.out.println("입력 후 '끝' 쓰세요~~~");
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			// System.in.read()는 1바이트씩 읽는다.
			
			int i;
			while((i = isr.read()) !='끝'){
				System.out.print((char)i);
				//int i = System.in.read();
				//i = System.in.read();
			
			}
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
