package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileInOutTest {
	public static void main(String[] args) throws IOException{
		
		//아스키 값을 숫자로 찍으면 -> 문자로 보임.
		//true 라고 쓰면 연결해서 찎어줌.
//		FileOutputStream fos = new FileOutputStream("data.txt",true);
//		fos.write(101);
//		fos.write(102);
//		fos.write(103);
//		
//		fos.close();
//		
//		FileInputStream fis = new FileInputStream("data.txt");
//		
//		int i;
//		
//		while((i != fis.read()) != -1){
//			System.out.print((char)i);
//		}
		
		
		FileInputStream fis = new FileInputStream("n.dmg");
		FileOutputStream fos = new FileOutputStream("n2.dmg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int len = 0;
		long pseconds = System.currentTimeMillis();
		
		int i = 0;
		while(  (i=bis.read())  != -1){
			bos.write(i);
			len++;
		}
		
		pseconds = System.currentTimeMillis() - pseconds;
		
		System.out.println(pseconds +"milliseconds,length = "+len);
		 
		bis.close();
		bos.close();
		
		Socket socket = new Socket();
		new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		
	}

}
