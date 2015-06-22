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
		
		
		//File writer / reader ���ڿ� stream
		//FileWriter fw = new FileWriter("a.txt");
		//FileReader fr = new FileReader();
		
		
		
		
		dos.writeUTF("�ȳ��ϼ���:");
		dos.writeInt(100); //4����Ʈ
		dos.write(100); //1����Ʈ
		dos.writeFloat(3.14f);
		
		dos.close();
		
		FileInputStream fis = new FileInputStream("data.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		//������ type��� �о��ִ� ���� �߿��ϴ�.
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
