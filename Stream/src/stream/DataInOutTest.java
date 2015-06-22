package stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataInOutTest {

	public static void main(String[] args) throws IOException{
		
		FileOutputStream fos = new FileOutputStream("data.txt");
		
		DataOutputStream dos = new DataOutputStream(fos);
		
		
		//File writer / reader 문자용 stream
		//FileWriter fw = new FileWriter("a.txt");
		//FileReader fr = new FileReader();
		
		
		
		
		dos.writeUTF("안녕하세요:");
		dos.writeInt(100); //4바이트
		dos.write(100); //1바이트
		dos.writeFloat(3.14f);
		
		dos.close();
		
		FileInputStream fis = new FileInputStream("data.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		//쓰여진 type대로 읽어주는 것이 중요하다.
		String str = dis.readUTF();
		int i = dis.readInt();
		int i2 = dis.read();
		float f = dis.readFloat();
		
		dis.close();
		
		System.out.println(str);
		System.out.println(i);
		System.out.println(i2);
		System.out.println(f);
		
		
	}

}
