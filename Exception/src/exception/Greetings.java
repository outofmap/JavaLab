package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Greetings {

	public static void main(String[] args) {

//		int i = 0;
//		String[] greetings = { "Hello", "Hi", "How are you?" };
//
//		while (i < 4) {
//			try {
//				System.out.println(greetings[i]);
//				i++;
//				
//				
//			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println(e); // toString
//			} finally {
//				System.out.println("always printed");
//				
//			}
//
//		}
		try{
			FileReader fr = new FileReader("a.txt");
			System.out.println("aaa");
			String str = null;
			System.out.println(str.toString());
			
		} catch(FileNotFoundException e){
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
