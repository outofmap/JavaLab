package thread;


class PriorityThread extends Thread{
	
	public void run(){
		int i = 0;
		
		System.out.println(this.getName() + ":우선순위"+this.getPriority()+"start");
		
		while(i <10000){
			i = i+1;
			
			try {
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.getName() + ":우선순위"+this.getPriority()+"end");
		
	}
}
public class PriorityTest {

	public static void main(String[] args) {
		
		int i;
		for(i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++){
			
			PriorityThread pt = new PriorityThread();
			pt.setPriority(i);
			pt.start();
		}
		

	}

}
