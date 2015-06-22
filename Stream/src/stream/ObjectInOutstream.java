package stream;

import java.io.DataOutput;
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable; 					//마크 인터페이스
import java.net.Socket;


class Person implements Externalizable{

	private String name;
	private int age;
	
	transient Socket socket = new Socket();
	private DataOutput ;

	public Person() {
		this.name = "무명";
		this.age = 1;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void aging() {
		this.age++;
	}

	public String toString() {
		return name + "," + age;
	}

	@Override
	public void readExternal(ObjectInput arg0) throws IOException,
			ClassNotFoundException {
		//out.writeUTF(name);
		//out.writeInt(age);
	}

	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
		//name = in.readUTF();
		//age = in.readInt();
	}
}

public class ObjectInOutstream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.setName("이승기");
		p2.setName("김수현");
		
		p1.aging();
		p2.aging();
		
		System.out.println(p1);
		System.out.println(p2);
		
		FileOutputStream fos = new FileOutputStream("object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
		
		FileInputStream fis = new FileInputStream("object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person ps1 = (Person)ois.readObject();
		Person ps2 = (Person)ois.readObject();
		
		System.out.println(ps1);
		System.out.println(ps2);
		
		ois.close();
	}

}
