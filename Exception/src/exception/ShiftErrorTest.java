package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;


public class ShiftErrorTest {
	
	public URL makeURL(String url) throws FileNotFoundException, MalformedURLException{
		
		FileReader fr = new FileReader("text.txt");
		
		return new URL(url);
		
	}

	public static void main(String[] args){
		ShiftErrorTest test = new ShiftErrorTest();
		try {
			test.makeURL("http://www.naver.com");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
}
