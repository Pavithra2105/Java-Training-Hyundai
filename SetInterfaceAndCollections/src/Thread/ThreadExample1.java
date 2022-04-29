package Thread;

class ThreadA extends Thread{
	
	 public void run() {
		 System.out.println("Thread A is running");
	 }
}
public class ThreadExample1 {

	public static void main(String[] args) {
		ThreadA tal = new ThreadA();
		tal.start();

	}

}
