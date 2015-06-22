package thread;

public class JoinTest extends Thread {
	
	int start;
	int end;
	int sum;
	
	public JoinTest(int start,int end){
		this.start = start;
		this.end = end;
		
	}
	
	public void run(){
		
		for (int i = start; i <= end; i++) {
			sum += i;
			try {
				sleep(1);	// 1/1000 초 마다 sleep! 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		JoinTest jt1 = new JoinTest(1,50);
		JoinTest jt2 = new JoinTest(51,100);
		
		jt1.start();
		jt2.start();
		
		//main thread가 Notrunnable 상태로 
		try {
			
			jt1.join();
			jt2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int lastSum = jt1.sum + jt2.sum;
		
		System.out.println("jt1.sum= "+jt1.sum+","+"jt2.sum= "+jt2.sum+", lastSum= "+lastSum);
		
		
		
	}

}
