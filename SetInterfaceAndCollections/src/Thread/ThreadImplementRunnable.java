package Thread;
import java.*;
class TobeThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Made to run as a thread and is running");
		
	}
	
}

public class ThreadImplementRunnable {
	
	public void main(String[] args) {
		TobeThread tb1 = new TobeThread();
	     Thread t1 = new Thread(tb1);
	     t1.start();	
	}
	     

}
