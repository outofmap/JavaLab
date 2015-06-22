package thread;

//class MyThread extends Thread{
//	
//	public void run(){
//		for (int i = 0; i < 200; i++) {
//			System.out.print(i+"\t");
//			
//		}
//	}
//}

class MyThread implements Runnable{
	
	private boolean flag = false;
	
	public void run(){
		
		while(!flag){
//		for(int i = 0; i < 200; i++){
//			System.out.println(i+"\t");
//		}
		}
	}
	
	public void setFlag(boolean flag){
		this.flag = flag;
	}
	
	
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("main start");
		
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		
//		t1.start();
//		t2.start();
		
		MyThread myTest = new MyThread();
		
		Thread th1 = new Thread(myTest);
		Thread th2 = new Thread(myTest);
		
		th1.start();
		th2.start();
		
		System.out.println("main end");
		
	}

}
